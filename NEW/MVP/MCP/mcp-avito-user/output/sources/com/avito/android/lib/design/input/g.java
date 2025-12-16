package com.avito.android.lib.design.input;

import com.avito.android.lib.design.input.Input;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f179405c;

    public /* synthetic */ g(Input input, int i12) {
        this.f179404b = i12;
        this.f179405c = input;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Input input = this.f179405c;
        switch (this.f179404b) {
            case 0:
                Input.c cVar = Input.f179303W;
                input.w();
                if (input.f179353y) {
                    input.q();
                    break;
                }
                break;
            case 1:
                Input.c cVar2 = Input.f179303W;
                input.w();
                break;
            default:
                input.v();
                break;
        }
    }
}
