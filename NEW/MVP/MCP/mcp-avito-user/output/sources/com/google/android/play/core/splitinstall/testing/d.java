package com.google.android.play.core.splitinstall.testing;

import androidx.camera.core.Q;
import com.google.android.play.core.splitinstall.internal.s0;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f358856c = new s0("LocalTestingConfigParser");

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f358857a;

    /* renamed from: b, reason: collision with root package name */
    public final C37245c f358858b;

    public d(XmlPullParser xmlPullParser) {
        this.f358857a = xmlPullParser;
        y yVar = y.f358903a;
        C37245c c37245c = new C37245c();
        c37245c.f358855b = new HashMap();
        this.f358858b = c37245c;
    }

    public static y a(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return y.f358903a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final d dVar = new d(xmlPullParserNewPullParser);
                dVar.b("local-testing-config", new C() { // from class: com.google.android.play.core.splitinstall.testing.B
                    @Override // com.google.android.play.core.splitinstall.testing.C
                    public final void zza() throws XmlPullParserException, IOException {
                        final d dVar2 = this.f358837a;
                        dVar2.getClass();
                        dVar2.b("split-install-errors", new C() { // from class: com.google.android.play.core.splitinstall.testing.A
                            @Override // com.google.android.play.core.splitinstall.testing.C
                            public final void zza() throws XmlPullParserException, IOException {
                                int i12 = 0;
                                while (true) {
                                    final d dVar3 = dVar2;
                                    if (i12 >= dVar3.f358857a.getAttributeCount()) {
                                        dVar3.b("split-install-error", new C() { // from class: com.google.android.play.core.splitinstall.testing.z
                                            @Override // com.google.android.play.core.splitinstall.testing.C
                                            public final void zza() throws XmlPullParserException {
                                                d dVar4;
                                                XmlPullParser xmlPullParser;
                                                int i13 = 0;
                                                String attributeValue = null;
                                                String attributeValue2 = null;
                                                while (true) {
                                                    dVar4 = dVar3;
                                                    int attributeCount = dVar4.f358857a.getAttributeCount();
                                                    xmlPullParser = dVar4.f358857a;
                                                    if (i13 >= attributeCount) {
                                                        break;
                                                    }
                                                    if ("module".equals(xmlPullParser.getAttributeName(i13))) {
                                                        attributeValue = xmlPullParser.getAttributeValue(i13);
                                                    }
                                                    if ("errorCode".equals(xmlPullParser.getAttributeName(i13))) {
                                                        attributeValue2 = xmlPullParser.getAttributeValue(i13);
                                                    }
                                                    i13++;
                                                }
                                                if (attributeValue == null || attributeValue2 == null) {
                                                    throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser, null);
                                                }
                                                Integer num = (Integer) PY0.c.f13134c.get(attributeValue2);
                                                if (num == null) {
                                                    throw new IllegalArgumentException(attributeValue2.concat(" is unknown error."));
                                                }
                                                dVar4.f358858b.b().put(attributeValue, num);
                                                while (xmlPullParser.next() != 3) {
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    XmlPullParser xmlPullParser = dVar3.f358857a;
                                    if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i12))) {
                                        String attributeValue = xmlPullParser.getAttributeValue(i12);
                                        Integer num = (Integer) PY0.c.f13134c.get(attributeValue);
                                        if (num == null) {
                                            throw new IllegalArgumentException(String.valueOf(attributeValue).concat(" is unknown error."));
                                        }
                                        dVar3.f358858b.f358854a = num;
                                    }
                                    i12++;
                                }
                            }
                        });
                    }
                });
                C37245c c37245c = dVar.f358858b;
                c37245c.a(Collections.unmodifiableMap(c37245c.b()));
                if (c37245c.f358855b == null) {
                    throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
                }
                f fVar = new f(c37245c.f358854a, c37245c.f358855b, null);
                fileReader.close();
                return fVar;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e12) {
            f358856c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e12.getMessage());
            return y.f358903a;
        }
    }

    public final void b(String str, C c12) throws XmlPullParserException, IOException {
        while (true) {
            XmlPullParser xmlPullParser = this.f358857a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException(Q.a("Expected '", str, "' tag but found '", xmlPullParser.getName(), "'."), xmlPullParser, null);
                }
                c12.zza();
            }
        }
    }
}
