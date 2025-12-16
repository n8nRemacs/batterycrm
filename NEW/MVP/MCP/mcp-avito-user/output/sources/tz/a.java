package TZ;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f15700c;

    public /* synthetic */ a(b bVar, int i12) {
        this.f15699b = i12;
        this.f15700c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f15700c;
        switch (this.f15699b) {
            case 0:
                int i12 = b.f15701G;
                bVar.dismiss();
                break;
            case 1:
                bVar.dismiss();
                break;
            case 2:
                bVar.dismiss();
                break;
            default:
                bVar.dismiss();
                break;
        }
    }
}
