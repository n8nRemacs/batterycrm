package com.avito.android.developments_agency_search.deeplink;

import android.content.Context;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.developments_agency_search.deeplink.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29841l extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HelpCenterLink f136448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C29842m f136449m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29841l(HelpCenterLink helpCenterLink, C29842m c29842m) {
        super(1);
        this.f136448l = helpCenterLink;
        this.f136449m = c29842m;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        return new com.avito.android.developments_agency_search.screen.help_center.a(context, new HelpCenterArguments("navigation_menu", this.f136448l.f136381b), this.f136449m.f136451e);
    }
}
