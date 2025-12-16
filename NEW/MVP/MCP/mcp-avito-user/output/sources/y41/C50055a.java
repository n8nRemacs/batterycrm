package y41;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: DebugMetaInterface.java */
/* renamed from: y41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50055a implements InterfaceC50060f {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C12886a> f442894b = new ArrayList<>();

    /* compiled from: DebugMetaInterface.java */
    /* renamed from: y41.a$a, reason: collision with other inner class name */
    public static class C12886a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final String f442895b;

        public C12886a(String str) {
            this.f442895b = str;
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("DebugImage{uuid='"), this.f442895b, "', type='proguard'}");
        }
    }

    @Override // y41.InterfaceC50060f
    public final String M0() {
        return "debug_meta";
    }

    public final int hashCode() {
        return this.f442894b.hashCode();
    }

    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("DebugMetaInterface{debugImages="), this.f442894b, '}');
    }
}
