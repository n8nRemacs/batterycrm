package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends AbstractC22740f>> f43927b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, ArrayList<AbstractC22740f>> f43928a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC22740f>> map = new HashMap<>();
        f43927b = map;
        try {
            map.put("KeyAttribute", C22741g.class.getConstructor(new Class[0]));
            map.put("KeyPosition", j.class.getConstructor(new Class[0]));
            map.put("KeyCycle", C22742h.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", l.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", m.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public i() {
    }

    public final void a(p pVar) {
        Integer numValueOf = Integer.valueOf(pVar.f44007c);
        HashMap<Integer, ArrayList<AbstractC22740f>> map = this.f43928a;
        ArrayList<AbstractC22740f> arrayList = map.get(numValueOf);
        if (arrayList != null) {
            pVar.f44027w.addAll(arrayList);
        }
        ArrayList<AbstractC22740f> arrayList2 = map.get(-1);
        if (arrayList2 != null) {
            Iterator<AbstractC22740f> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC22740f next = it.next();
                String str = ((ConstraintLayout.b) pVar.f44006b.getLayoutParams()).f44179Z;
                String str2 = next.f43889c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    pVar.f44027w.add(next);
                }
            }
        }
    }

    public final void b(AbstractC22740f abstractC22740f) {
        Integer numValueOf = Integer.valueOf(abstractC22740f.f43888b);
        HashMap<Integer, ArrayList<AbstractC22740f>> map = this.f43928a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(abstractC22740f.f43888b), new ArrayList<>());
        }
        ArrayList<AbstractC22740f> arrayList = map.get(Integer.valueOf(abstractC22740f.f43888b));
        if (arrayList != null) {
            arrayList.add(abstractC22740f);
        }
    }

    public i(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC22740f abstractC22740f = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends AbstractC22740f>> map3 = f43927b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor<? extends AbstractC22740f> constructor = map3.get(name);
                            if (constructor != null) {
                                AbstractC22740f abstractC22740fNewInstance = constructor.newInstance(new Object[0]);
                                try {
                                    abstractC22740fNewInstance.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(abstractC22740fNewInstance);
                                } catch (Exception unused) {
                                }
                                abstractC22740f = abstractC22740fNewInstance;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC22740f != null && (map2 = abstractC22740f.f43890d) != null) {
                            ConstraintAttribute.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC22740f != null && (map = abstractC22740f.f43890d) != null) {
                        ConstraintAttribute.d(context, xmlResourceParser, map);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e12) {
            e12.printStackTrace();
        } catch (XmlPullParserException e13) {
            e13.printStackTrace();
        }
    }
}
