package qq;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* renamed from: qq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC47428b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f429371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47429c f429372c;

    public /* synthetic */ ViewOnClickListenerC47428b(C47429c c47429c, int i12) {
        this.f429371b = i12;
        this.f429372c = c47429c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f429371b) {
            case 0:
                this.f429372c.f429374b.invoke();
                break;
            default:
                this.f429372c.f429375c.invoke();
                break;
        }
    }
}
