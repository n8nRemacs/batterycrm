package com.avito.android.publish;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.b0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final /* synthetic */ class C33541b0 extends kotlin.jvm.internal.H implements Y41.q<Integer, Integer, Intent, kotlin.G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33541b0(PublishActivity publishActivity) {
        super(3, L.a.class, "resultHandler", "restoreCategoryParametersState$resultHandler(Lcom/avito/android/publish/PublishActivity;IILandroid/content/Intent;)V", 0);
        this.f232314b = publishActivity;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(Integer num, Integer num2, Intent intent) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Intent intent2 = intent;
        int i12 = PublishActivity.f231968H;
        PublishActivity publishActivity = this.f232314b;
        Fragment fragmentH = publishActivity.getSupportFragmentManager().H("scan_tag");
        if (fragmentH == null && (fragmentH = publishActivity.getSupportFragmentManager().H("details_step_for_fill_params_tag")) == null) {
            FragmentManager supportFragmentManager = publishActivity.getSupportFragmentManager();
            C0 c02 = publishActivity.f231984u;
            if (c02 == null) {
                c02 = null;
            }
            fragmentH = supportFragmentManager.H(PublishActivity.h2(c02.f231861Y.getStepIndex()));
        }
        if (fragmentH != null) {
            fragmentH.onActivityResult(iIntValue, iIntValue2, intent2);
        }
        return kotlin.G0.f406611a;
    }
}
