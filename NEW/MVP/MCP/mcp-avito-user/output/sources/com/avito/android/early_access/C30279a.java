package com.avito.android.early_access;

import androidx.fragment.app.DialogFragment;
import com.avito.android.early_access.deeplink.EarlyAccessLink;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30279a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30281c f145074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessLink f145075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30279a(C30281c c30281c, EarlyAccessLink earlyAccessLink) {
        super(0);
        this.f145074l = c30281c;
        this.f145075m = earlyAccessLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        C30281c c30281c = this.f145074l;
        return c30281c.f145266f.a(this.f145075m.f145276c);
    }
}
