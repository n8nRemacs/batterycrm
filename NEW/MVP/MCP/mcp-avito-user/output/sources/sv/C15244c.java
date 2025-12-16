package Sv;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.di.module.C30102l3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CustomTariffsItemModule_ProvideCustomTariffsListItemDecorationFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LSv/c;", "Ldagger/internal/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sv.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15244c implements dagger.internal.h<RecyclerView.l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f15185b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f15186a;

    /* compiled from: CustomTariffsItemModule_ProvideCustomTariffsListItemDecorationFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSv/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sv.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15244c(@Y61.k C30102l3 c30102l3) {
        this.f15186a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f15186a.get();
        f15185b.getClass();
        int i12 = C15242a.f15182a;
        return new com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.f(context.getResources());
    }
}
