package org.mockito.internal.configuration.plugins;

import i81.InterfaceC41250j;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: PluginFinder.java */
/* loaded from: classes7.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC41250j f421499a;

    public d(InterfaceC41250j interfaceC41250j) {
        this.f421499a = interfaceC41250j;
    }

    public final String a(ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (true) {
            InputStream inputStreamOpenStream = null;
            if (!it.hasNext()) {
                return null;
            }
            URL url = (URL) it.next();
            try {
                try {
                    inputStreamOpenStream = url.openStream();
                    new c();
                    String strA = c.a(inputStreamOpenStream);
                    if (strA != null) {
                        this.f421499a.getClass();
                        return strA;
                    }
                } catch (Exception e12) {
                    throw new MockitoException("Problems reading plugin implementation from: " + url, e12);
                }
            } finally {
                Z71.a.a(inputStreamOpenStream);
            }
        }
    }

    public final ArrayList b(ArrayList arrayList) throws IOException {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            URL url = (URL) it.next();
            InputStream inputStreamOpenStream = null;
            try {
                try {
                    inputStreamOpenStream = url.openStream();
                    new c();
                    String strA = c.a(inputStreamOpenStream);
                    if (strA != null) {
                        this.f421499a.getClass();
                        arrayList2.add(strA);
                    }
                } catch (Exception e12) {
                    throw new MockitoException("Problems reading plugin implementation from: " + url, e12);
                }
            } finally {
                Z71.a.a(inputStreamOpenStream);
            }
        }
        return arrayList2;
    }
}
