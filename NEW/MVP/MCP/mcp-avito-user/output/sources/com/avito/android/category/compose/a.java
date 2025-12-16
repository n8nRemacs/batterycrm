package com.avito.android.category.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import com.avito.android.category.ListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "rotation", "_avito_category_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: CategoryItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.category.compose.a$a, reason: collision with other inner class name */
    public static final class C3397a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ListItem, G0> f116494l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ListItem.Category f116495m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3397a(Y41.l<? super ListItem, G0> lVar, ListItem.Category category) {
            super(0);
            this.f116494l = lVar;
            this.f116495m = category;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f116494l.invoke(this.f116495m);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC22276o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<Float> f116496l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I3<Float> i32) {
            super(1);
            this.f116496l = i32;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            interfaceC22276o0.d(this.f116496l.getF42167b().floatValue());
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ListItem.Category f116497l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ListItem, G0> f116498m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f116499n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ListItem.Category category, Y41.l<? super ListItem, G0> lVar, int i12) {
            super(2);
            this.f116497l = category;
            this.f116498m = lVar;
            this.f116499n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f116499n | 1);
            a.a(this.f116497l, this.f116498m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[ListItem.Category.Badge.Size.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ListItem.Category.Badge.Size size = ListItem.Category.Badge.Size.f116484b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ListItem.Category.Badge.Size size2 = ListItem.Category.Badge.Size.f116484b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027a  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.category.ListItem.Category r34, @Y61.k Y41.l<? super com.avito.android.category.ListItem, kotlin.G0> r35, @Y61.l androidx.compose.runtime.A r36, int r37) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category.compose.a.a(com.avito.android.category.ListItem$Category, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
