package LM;

import AK0.l;
import JM.i;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImportantAddressesStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM/d;", "LJM/i;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f9921a;

    @Inject
    public d(@k l lVar) {
        this.f9921a = lVar;
    }

    @Override // JM.i
    public final void a() {
        this.f9921a.getF316a().edit().remove("key_important_addresses_badge_shown").remove("key_important_addresses_count").remove("key_important_addresses_max_show_count").apply();
    }

    @Override // JM.i
    public final int b() {
        return this.f9921a.getInt("key_important_addresses_max_show_count", 0);
    }

    @Override // JM.i
    public final void c(@Y61.l Integer num) {
        this.f9921a.getF316a().edit().putInt("key_important_addresses_max_show_count", num.intValue()).apply();
    }

    @Override // JM.i
    public final void d(@Y61.l Integer num) {
        this.f9921a.getF316a().edit().putInt("key_important_addresses_count", num != null ? num.intValue() : 0).apply();
    }

    @Override // JM.i
    public final int e() {
        return this.f9921a.getInt("key_important_addresses_count", 0);
    }

    @Override // JM.i
    public final boolean f() {
        return this.f9921a.c("key_important_addresses_badge_shown");
    }

    @Override // JM.i
    public final void g() {
        this.f9921a.getF316a().edit().putBoolean("key_important_addresses_badge_shown", true).apply();
    }
}
