package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.ArrayMap;
import android.util.Log;
import android.util.LruCache;
import java.io.IOException;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class xf {
    public static final s6b c = new s6b(4);
    public final Context a;
    public final Resources b;

    public xf(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public static boolean d(Animator animator) {
        AnimatorSet animatorSet = animator instanceof AnimatorSet ? (AnimatorSet) animator : null;
        if (animatorSet == null) {
            ObjectAnimator objectAnimator = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
            return fni.a(objectAnimator != null ? objectAnimator.getPropertyName() : null, "pathData");
        }
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        if (childAnimations.isEmpty()) {
            return false;
        }
        for (Animator animator2 : childAnimations) {
            ObjectAnimator objectAnimator2 = animator2 instanceof ObjectAnimator ? (ObjectAnimator) animator2 : null;
            if (fni.a(objectAnimator2 != null ? objectAnimator2.getPropertyName() : null, "pathData")) {
                return true;
            }
        }
        return false;
    }

    public final Animator a(int i) {
        mh mhVar = new mh(this.a);
        s6b s6bVar = mh.c;
        Animator animator = (Animator) ((LruCache) s6bVar.a).get(Integer.valueOf(i));
        if (animator != null) {
            return animator.clone();
        }
        Animator animatorA = mhVar.a(mhVar.b.getAnimation(i), null, 0);
        if (animatorA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((LruCache) s6bVar.a).put(Integer.valueOf(i), animatorA.clone());
        return animatorA;
    }

    public final wf b(int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        wf wfVar;
        int i2;
        s6b s6bVar = c;
        wf wfVar2 = (wf) ((LruCache) s6bVar.a).get(Integer.valueOf(i));
        int i3 = 0;
        if (wfVar2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = new ArrayMap();
            ArrayList arrayList2 = wfVar2.b;
            int i4 = ve3.i(arrayList2);
            if (i4 >= 0) {
                int i5 = 0;
                while (true) {
                    Object objJ = ue3.J(i5, arrayList2);
                    if (objJ != null) {
                        Animator animator = (Animator) objJ;
                        Animator animatorClone = animator.clone();
                        arrayList.add(animatorClone);
                        arrayMap.put(animatorClone, wfVar2.c.get(animator));
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5++;
                }
            }
            wfVar = new wf(new EnhancedVectorDrawable(wfVar2.a), arrayList, arrayMap);
        } else {
            wfVar = null;
        }
        if (wfVar != null) {
            return wfVar;
        }
        XmlResourceParser xml = this.b.getXml(i);
        int next = xml.next();
        while (true) {
            i2 = 2;
            if (next == 2 || next == 1) {
                break;
            }
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        try {
            try {
                int eventType = xml.getEventType();
                int depth = xml.getDepth();
                EnhancedVectorDrawable enhancedVectorDrawable = null;
                while (eventType != 1) {
                    if (xml.getDepth() < depth && eventType == 3) {
                        break;
                    }
                    if (eventType != i2) {
                        eventType = xml.next();
                    } else {
                        String name = xml.getName();
                        if (fni.a(name, "animated-vector")) {
                            EnhancedVectorDrawable enhancedVectorDrawableC = c(xml);
                            enhancedVectorDrawableC.getPixelSize();
                            enhancedVectorDrawable = enhancedVectorDrawableC;
                        } else if (fni.a(name, "target")) {
                            int attributeCount = xml.getAttributeCount();
                            int i6 = i3;
                            String attributeValue = null;
                            while (i6 < attributeCount) {
                                String attributeName = xml.getAttributeName(i6);
                                if (fni.a(attributeName, SdkMetricStatEvent.NAME_KEY)) {
                                    attributeValue = xml.getAttributeValue(i6);
                                } else if (fni.a(attributeName, "animation")) {
                                    int attributeResourceValue = xml.getAttributeResourceValue(i6, i3);
                                    if (attributeResourceValue != 0) {
                                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.a, attributeResourceValue);
                                        if (d(animatorLoadAnimator)) {
                                            animatorLoadAnimator = a(attributeResourceValue);
                                        }
                                        arrayList3.add(animatorLoadAnimator);
                                        arrayMap2.put(animatorLoadAnimator, attributeValue);
                                    }
                                } else {
                                    Log.w(xf.class.getSimpleName(), "unknown attribute '" + attributeName + "'. Skipping");
                                }
                                i6++;
                                i3 = 0;
                            }
                        }
                        eventType = xml.next();
                        i3 = 0;
                        i2 = 2;
                    }
                }
                xml.close();
                if (enhancedVectorDrawable == null) {
                    throw new IllegalArgumentException("VectorDrawable was not found in XML");
                }
                wf wfVar3 = new wf(enhancedVectorDrawable, arrayList3, arrayMap2);
                ((LruCache) s6bVar.a).put(Integer.valueOf(i), wfVar3);
                return wfVar3;
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
                throw e2;
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final EnhancedVectorDrawable c(XmlResourceParser xmlResourceParser) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = 0;
        while (true) {
            if (i >= attributeCount) {
                break;
            }
            if (fni.a(xmlResourceParser.getAttributeName(i), "drawable")) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
                if (attributeResourceValue != 0) {
                    return new EnhancedVectorDrawable(this.b, attributeResourceValue);
                }
            } else {
                i++;
            }
        }
        throw new IllegalStateException();
    }
}
