package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SemanticsConfiguration.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SemanticsConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41790l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final T invoke() {
            return null;
        }
    }

    @Y61.l
    public static final <T> T a(@Y61.k l lVar, @Y61.k E<T> e12) {
        a aVar = a.f41790l;
        T t12 = (T) lVar.f41786b.e(e12);
        return t12 == null ? aVar.invoke() : t12;
    }
}
