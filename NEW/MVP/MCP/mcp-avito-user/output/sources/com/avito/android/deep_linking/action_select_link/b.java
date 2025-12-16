package com.avito.android.deep_linking.action_select_link;

import Au.DialogC13081c;
import Y41.l;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionSelectLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionSelectLink f132885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f132886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f132887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f132888o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionSelectLink actionSelectLink, c cVar, String str, Bundle bundle) {
        super(1);
        this.f132885l = actionSelectLink;
        this.f132886m = cVar;
        this.f132887n = str;
        this.f132888o = bundle;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        return new DialogC13081c(context, this.f132885l, new a(this.f132886m, this.f132887n, this.f132888o));
    }
}
