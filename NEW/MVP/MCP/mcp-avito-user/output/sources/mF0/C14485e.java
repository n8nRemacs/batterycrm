package Mf0;

import Nf0.C14569a;
import Nf0.C14572d;
import Nf0.C14573e;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.remote.model.LimitsInfo;
import kotlin.Metadata;

/* compiled from: PublishLimitsEventTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMf0/e;", "LMf0/d;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mf0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14485e implements InterfaceC14484d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f10984a;

    public C14485e(@k InterfaceC28373a interfaceC28373a) {
        this.f10984a = interfaceC28373a;
    }

    @Override // Mf0.InterfaceC14484d
    public final void a(@k String str, @k String str2, @l LimitsInfo limitsInfo) {
        this.f10984a.c(new C14569a(str, str2, limitsInfo != null ? C14481a.a(limitsInfo) : null));
    }

    @Override // Mf0.InterfaceC14484d
    public final void b(@k ItemId itemId, @k LimitsInfo limitsInfo) {
        this.f10984a.c(new C14572d(itemId.f245800b, C14481a.a(limitsInfo)));
    }

    @Override // Mf0.InterfaceC14484d
    public final void c(@k String str, @k LimitsInfo limitsInfo) {
        this.f10984a.c(new C14573e(str, C14481a.a(limitsInfo)));
    }
}
