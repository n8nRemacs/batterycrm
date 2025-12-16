package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.sequences.C43025h;

/* compiled from: _Sequences.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/sequences/T;", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class T implements InterfaceC43030m<Object> {

    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.a f410487l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.a aVar) {
            super(1);
            this.f410487l = aVar;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            l0.a aVar = this.f410487l;
            boolean z12 = true;
            if (!aVar.f406838b && kotlin.jvm.internal.L.f(obj, null)) {
                aVar.f406838b = true;
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }
    }

    @Override // kotlin.sequences.InterfaceC43030m
    public final Iterator<Object> iterator() {
        return new C43025h.a(C43033p.i(null, new a(new l0.a())));
    }
}
