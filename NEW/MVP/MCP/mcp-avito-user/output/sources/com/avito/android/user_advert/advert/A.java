package com.avito.android.user_advert.advert;

import android.content.Intent;
import android.os.Parcelable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsActivity f308199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f308200d;

    public /* synthetic */ A(MyAdvertDetailsActivity myAdvertDetailsActivity, Intent intent, int i12) {
        this.f308198b = i12;
        this.f308199c = myAdvertDetailsActivity;
        this.f308200d = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = this.f308200d;
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f308199c;
        switch (this.f308198b) {
            case 0:
                myAdvertDetailsActivity.f308293O0.b(intent);
                myAdvertDetailsActivity.getIntent().putExtra("nested_intent", (Parcelable) null);
                break;
            default:
                int i12 = MyAdvertDetailsActivity.f308263Q0;
                myAdvertDetailsActivity.sendBroadcast(intent);
                break;
        }
    }
}
