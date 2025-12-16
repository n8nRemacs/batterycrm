package androidx.view;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.media3.common.C23088b;
import androidx.view.AbstractC23292H0;
import androidx.view.C23389r;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import j.M;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/A0;", "", "a", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.A0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23278A0 {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f52737c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ThreadLocal<TypedValue> f52738d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f52739a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23303N0 f52740b;

    /* compiled from: NavInflater.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/navigation/A0$a;", "", "<init>", "()V", "", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.A0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static AbstractC23292H0 a(@k TypedValue typedValue, @l AbstractC23292H0 abstractC23292H0, @k AbstractC23292H0 abstractC23292H02, @l String str, @k String str2) throws XmlPullParserException {
            if (abstractC23292H0 == null || abstractC23292H0 == abstractC23292H02) {
                return abstractC23292H0 == null ? abstractC23292H02 : abstractC23292H0;
            }
            StringBuilder sbB = C23088b.b("Type is ", str, " but found ", str2, ": ");
            sbB.append(typedValue.data);
            throw new XmlPullParserException(sbB.toString());
        }

        public a() {
        }
    }

    public C23278A0(@k Context context, @k C23303N0 c23303n0) {
        this.f52739a = context;
        this.f52740b = c23303n0;
    }

    public static C23389r c(TypedArray typedArray, Resources resources, int i12) throws XmlPullParserException, Resources.NotFoundException, ClassNotFoundException {
        AbstractC23292H0<Object> abstractC23292H0A;
        AbstractC23292H0<Object> abstractC23292H0;
        C23389r.a aVar = new C23389r.a();
        int i13 = 0;
        aVar.f53176b = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f52738d;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objF = null;
        if (string != null) {
            AbstractC23292H0.l lVar = AbstractC23292H0.f52782b;
            String resourcePackageName = resources.getResourcePackageName(i12);
            if (string.startsWith("java")) {
                try {
                    String str = "j$" + string.substring(4);
                    lVar.getClass();
                    abstractC23292H0A = AbstractC23292H0.l.a(str, resourcePackageName);
                } catch (RuntimeException e12) {
                    if (!(e12.getCause() instanceof ClassNotFoundException)) {
                        throw e12;
                    }
                }
            } else {
                lVar.getClass();
                abstractC23292H0A = AbstractC23292H0.l.a(string, resourcePackageName);
            }
        } else {
            abstractC23292H0A = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            AbstractC23292H0.i iVar = AbstractC23292H0.f52784d;
            if (abstractC23292H0A == iVar) {
                int i14 = typedValue.resourceId;
                if (i14 != 0) {
                    i13 = i14;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC23292H0A.b() + ". Must be a reference to a resource.");
                }
                objF = Integer.valueOf(i13);
            } else {
                int i15 = typedValue.resourceId;
                if (i15 != 0) {
                    if (abstractC23292H0A != null) {
                        iVar.getClass();
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC23292H0A.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    abstractC23292H0A = iVar;
                    objF = Integer.valueOf(i15);
                } else if (abstractC23292H0A == AbstractC23292H0.f52792l) {
                    objF = typedArray.getString(1);
                } else {
                    int i16 = typedValue.type;
                    if (i16 != 3) {
                        a aVar2 = f52737c;
                        if (i16 == 4) {
                            AbstractC23292H0.d dVar = AbstractC23292H0.f52788h;
                            aVar2.getClass();
                            abstractC23292H0A = a.a(typedValue, abstractC23292H0A, dVar, string, "float");
                            objF = Float.valueOf(typedValue.getFloat());
                        } else if (i16 == 5) {
                            AbstractC23292H0.f fVar = AbstractC23292H0.f52783c;
                            aVar2.getClass();
                            abstractC23292H0A = a.a(typedValue, abstractC23292H0A, fVar, string, "dimension");
                            objF = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                        } else if (i16 == 18) {
                            AbstractC23292H0.b bVar = AbstractC23292H0.f52790j;
                            aVar2.getClass();
                            abstractC23292H0A = a.a(typedValue, abstractC23292H0A, bVar, string, BooleanParameter.TYPE);
                            objF = Boolean.valueOf(typedValue.data != 0);
                        } else {
                            if (i16 < 16 || i16 > 31) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                            }
                            AbstractC23292H0.d dVar2 = AbstractC23292H0.f52788h;
                            if (abstractC23292H0A == dVar2) {
                                aVar2.getClass();
                                abstractC23292H0A = a.a(typedValue, abstractC23292H0A, dVar2, string, "float");
                                objF = Float.valueOf(typedValue.data);
                            } else {
                                AbstractC23292H0.f fVar2 = AbstractC23292H0.f52783c;
                                aVar2.getClass();
                                abstractC23292H0A = a.a(typedValue, abstractC23292H0A, fVar2, string, "integer");
                                objF = Integer.valueOf(typedValue.data);
                            }
                        }
                    } else {
                        String string2 = typedValue.string.toString();
                        if (abstractC23292H0A == null) {
                            AbstractC23292H0.f52782b.getClass();
                            try {
                                try {
                                    try {
                                        try {
                                            abstractC23292H0 = AbstractC23292H0.f52783c;
                                            abstractC23292H0.f(string2);
                                        } catch (IllegalArgumentException unused) {
                                            abstractC23292H0 = AbstractC23292H0.f52786f;
                                            abstractC23292H0.f(string2);
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        abstractC23292H0 = AbstractC23292H0.f52792l;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    abstractC23292H0 = AbstractC23292H0.f52790j;
                                    abstractC23292H0.f(string2);
                                }
                            } catch (IllegalArgumentException unused4) {
                                abstractC23292H0 = AbstractC23292H0.f52788h;
                                abstractC23292H0.f(string2);
                            }
                            abstractC23292H0A = abstractC23292H0;
                        }
                        objF = abstractC23292H0A.f(string2);
                    }
                }
            }
        }
        if (objF != null) {
            aVar.f53177c = objF;
            aVar.f53178d = true;
        }
        if (abstractC23292H0A != null) {
            aVar.f53175a = abstractC23292H0A;
        }
        return aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.view.C23317W a(android.content.res.Resources r23, android.content.res.XmlResourceParser r24, android.util.AttributeSet r25, int r26) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23278A0.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.W");
    }

    @k
    @SuppressLint({"ResourceType"})
    public final C23324b0 b(@M int i12) throws Resources.NotFoundException {
        int next;
        Resources resources = this.f52739a.getResources();
        XmlResourceParser xml = resources.getXml(i12);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e12) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i12) + " line " + xml.getLineNumber(), e12);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        C23317W c23317wA = a(resources, xml, attributeSetAsAttributeSet, i12);
        if (c23317wA instanceof C23324b0) {
            return (C23324b0) c23317wA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
