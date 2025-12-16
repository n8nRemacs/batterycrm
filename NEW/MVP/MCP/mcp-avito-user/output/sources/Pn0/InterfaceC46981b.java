package pN0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nN0.C44297b;

/* compiled from: VideoRequirementsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LpN0/b;", "", "a", "b", "c", "LpN0/b$a;", "LpN0/b$b;", "LpN0/b$c;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pN0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC46981b {

    /* compiled from: VideoRequirementsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpN0/b$a;", "LpN0/b;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pN0.b$a */
    public static final /* data */ class a implements InterfaceC46981b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C44297b f428509a;

        public a(@l C44297b c44297b) {
            this.f428509a = c44297b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f428509a, ((a) obj).f428509a);
        }

        public final int hashCode() {
            C44297b c44297b = this.f428509a;
            if (c44297b == null) {
                return 0;
            }
            return c44297b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(requirements=" + this.f428509a + ')';
        }
    }

    /* compiled from: VideoRequirementsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpN0/b$b;", "LpN0/b;", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pN0.b$b, reason: collision with other inner class name */
    public static final class C12270b implements InterfaceC46981b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12270b f428510a = new C12270b();
    }

    /* compiled from: VideoRequirementsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpN0/b$c;", "LpN0/b;", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pN0.b$c */
    public static final class c implements InterfaceC46981b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428511a = new c();
    }
}
