package vm;

import AK0.l;
import Y61.k;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvm/d;", "Lvm/c;", "_avito_campaigns-sale-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vm.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49349d implements InterfaceC49348c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f440941a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f440942b;

    /* compiled from: CampaignsSaleStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"vm/d$a", "Lcom/google/gson/reflect/a;", "", "", "_avito_campaigns-sale-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vm.d$a */
    public static final class a extends com.google.gson.reflect.a<List<? extends String>> {
    }

    /* compiled from: CampaignsSaleStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"vm/d$b", "Lcom/google/gson/reflect/a;", "", "", "_avito_campaigns-sale-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vm.d$b */
    public static final class b extends com.google.gson.reflect.a<Map<String, ? extends String>> {
    }

    @Inject
    public C49349d(@k l lVar, @k Gson gson) {
        this.f440941a = lVar;
        this.f440942b = gson;
    }

    @Override // vm.InterfaceC49348c
    public final void a() {
        this.f440941a.putBoolean("campaigns_sale_discount_tooltip_shown", true);
    }

    @Override // vm.InterfaceC49348c
    public final void b(@k String str) {
        this.f440941a.putString("AvitoSalesOpenedPromotionKey", this.f440942b.l(Collections.singletonMap("key", str)));
    }

    @Override // vm.InterfaceC49348c
    @k
    public final ArrayList c(@k String str) {
        ArrayList arrayListC0 = C42745f0.c0(e(), str);
        this.f440941a.putString("campaigns_sale_search_queries", this.f440942b.l(arrayListC0));
        return arrayListC0;
    }

    @Override // vm.InterfaceC49348c
    public final void d(@k String str) {
        List<String> listE = e();
        if (listE.contains(str)) {
            return;
        }
        this.f440941a.putString("campaigns_sale_search_queries", this.f440942b.l(C42745f0.E0(C42745f0.h0(listE, Collections.singletonList(str)), 8)));
    }

    @Override // vm.InterfaceC49348c
    @k
    public final List<String> e() {
        String string = this.f440941a.getString("campaigns_sale_search_queries");
        if (string == null) {
            return C42784z0.f406748b;
        }
        return (List) this.f440942b.e(string, new a().getType());
    }

    @Override // vm.InterfaceC49348c
    public final boolean f() {
        return !this.f440941a.getBoolean("campaigns_sale_discount_tooltip_shown", false);
    }

    @Override // vm.InterfaceC49348c
    public final boolean g(@k String str) {
        String string = this.f440941a.getString("AvitoSalesOpenedPromotionKey");
        if (string == null) {
            return true;
        }
        return !L.f(((Map) this.f440942b.e(string, new b().getType())) != null ? (String) r0.get("key") : null, str);
    }
}
