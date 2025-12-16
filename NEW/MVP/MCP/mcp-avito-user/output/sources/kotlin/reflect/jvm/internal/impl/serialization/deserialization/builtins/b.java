package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import Y41.l;
import Y61.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.h;

/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class b extends G implements l<String, InputStream> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @k
    /* renamed from: getName */
    public final String getF407039i() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @k
    public final h getOwner() {
        return m0.f406844a.b(e.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @k
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // Y41.l
    public final InputStream invoke(String str) throws IOException {
        String str2 = str;
        ((e) this.receiver).getClass();
        ClassLoader classLoader = e.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str2);
        }
        URL resource = classLoader.getResource(str2);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
