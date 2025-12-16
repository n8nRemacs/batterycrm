package com.avito.android.imv_goods_poll;

import android.os.Bundle;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialog;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImvGoodsPollActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvGoodsPollActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f170581n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f170582m = C35961v3.a(this);

    /* compiled from: ImvGoodsPollActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollActivity$a;", "", "<init>", "()V", "", "DIALOG_TAG", "Ljava/lang/String;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ImvGoodsPollDialog.a aVar = ImvGoodsPollDialog.f170583s0;
            ImvGoodsPollParams imvGoodsPollParams = (ImvGoodsPollParams) this.f170582m.getValue();
            aVar.getClass();
            ImvGoodsPollDialog imvGoodsPollDialog = new ImvGoodsPollDialog();
            imvGoodsPollDialog.f170590m0.setValue(imvGoodsPollDialog, ImvGoodsPollDialog.f170584t0[0], imvGoodsPollParams);
            imvGoodsPollDialog.show(getSupportFragmentManager(), "imv_goods_poll_dialog");
        }
    }
}
