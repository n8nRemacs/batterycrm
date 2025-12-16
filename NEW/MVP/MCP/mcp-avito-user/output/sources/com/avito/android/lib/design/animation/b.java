package com.avito.android.lib.design.animation;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: AnimationViewEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/animation/b;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: AnimationViewEngine.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/animation/b$a;", "", "b", "c", "d", "Lcom/avito/android/lib/design/animation/b$a$b;", "Lcom/avito/android/lib/design/animation/b$a$c;", "Lcom/avito/android/lib/design/animation/b$a$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: AnimationViewEngine.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.animation.b$a$a, reason: collision with other inner class name */
        public static final class C5256a {
            @k
            public static AnimationView.EngineType a(@k a aVar) {
                if (aVar instanceof C5257b) {
                    return ((C5257b) aVar).f178332c;
                }
                if (aVar instanceof d) {
                    return ((d) aVar).f178337c;
                }
                if (aVar instanceof c) {
                    return ((c) aVar).f178334b;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* compiled from: AnimationViewEngine.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/b$a$b;", "Lcom/avito/android/lib/design/animation/b$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.animation.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C5257b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f178330a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f178331b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AnimationView.EngineType f178332c;

            public C5257b(@k String str, @l String str2, @k AnimationView.EngineType engineType) {
                this.f178330a = str;
                this.f178331b = str2;
                this.f178332c = engineType;
            }

            @Override // com.avito.android.lib.design.animation.b.a
            @k
            public final AnimationView.EngineType a() {
                return C5256a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5257b)) {
                    return false;
                }
                C5257b c5257b = (C5257b) obj;
                return L.f(this.f178330a, c5257b.f178330a) && L.f(this.f178331b, c5257b.f178331b) && this.f178332c == c5257b.f178332c;
            }

            public final int hashCode() {
                int iHashCode = this.f178330a.hashCode() * 31;
                String str = this.f178331b;
                return this.f178332c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "Json(value=" + this.f178330a + ", key=" + this.f178331b + ", engineType=" + this.f178332c + ')';
            }
        }

        /* compiled from: AnimationViewEngine.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/b$a$c;", "Lcom/avito/android/lib/design/animation/b$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public final int f178333a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AnimationView.EngineType f178334b;

            public c(int i12, @k AnimationView.EngineType engineType) {
                this.f178333a = i12;
                this.f178334b = engineType;
            }

            @Override // com.avito.android.lib.design.animation.b.a
            @k
            public final AnimationView.EngineType a() {
                return C5256a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f178333a == cVar.f178333a && this.f178334b == cVar.f178334b;
            }

            public final int hashCode() {
                return this.f178334b.hashCode() + (Integer.hashCode(this.f178333a) * 31);
            }

            @k
            public final String toString() {
                return "Resource(resId=" + this.f178333a + ", engineType=" + this.f178334b + ')';
            }
        }

        /* compiled from: AnimationViewEngine.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/b$a$d;", "Lcom/avito/android/lib/design/animation/b$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f178335a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f178336b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AnimationView.EngineType f178337c;

            public d(@k String str, @l String str2, @k AnimationView.EngineType engineType) {
                this.f178335a = str;
                this.f178336b = str2;
                this.f178337c = engineType;
            }

            @Override // com.avito.android.lib.design.animation.b.a
            @k
            public final AnimationView.EngineType a() {
                return C5256a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f178335a, dVar.f178335a) && L.f(this.f178336b, dVar.f178336b) && this.f178337c == dVar.f178337c;
            }

            public final int hashCode() {
                int iHashCode = this.f178335a.hashCode() * 31;
                String str = this.f178336b;
                return this.f178337c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "Url(url=" + this.f178335a + ", key=" + this.f178336b + ", engineType=" + this.f178337c + ')';
            }
        }

        @k
        AnimationView.EngineType a();
    }
}
