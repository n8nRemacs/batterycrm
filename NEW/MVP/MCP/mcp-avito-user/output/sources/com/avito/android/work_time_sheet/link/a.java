package com.avito.android.work_time_sheet.link;

import Y41.l;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WorkTimeSheetDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WorkTimeSheetBody f331324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WorkTimeSheetBody workTimeSheetBody) {
        super(1);
        this.f331324l = workTimeSheetBody;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        return new com.avito.android.work_time_sheet.ui.a(context, this.f331324l);
    }
}
