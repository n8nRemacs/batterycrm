package com.avito.android.lib.design.input;

import android.view.View;
import android.widget.ImageView;
import com.avito.android.lib.design.input.Input;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f179402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ImageView f179403d;

    public /* synthetic */ f(View.OnClickListener onClickListener, ImageView imageView, int i12) {
        this.f179401b = i12;
        this.f179402c = onClickListener;
        this.f179403d = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.f179403d;
        View.OnClickListener onClickListener = this.f179402c;
        switch (this.f179401b) {
            case 0:
                Input.c cVar = Input.f179303W;
                onClickListener.onClick(imageView);
                break;
            default:
                Input.c cVar2 = Input.f179303W;
                onClickListener.onClick(imageView);
                break;
        }
    }
}
