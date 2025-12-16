package Ga1;

import ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker;

/* loaded from: classes9.dex */
public final class e implements Ha1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePicker f6578a;

    public e(DatePicker datePicker) {
        this.f6578a = datePicker;
    }

    @Override // Ha1.d
    public final void a(Fa1.c cVar) {
        if (cVar == null || !(cVar instanceof Fa1.b)) {
            return;
        }
        f fVar = this.f6578a.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(Integer.parseInt(((Fa1.b) cVar).f4791a));
    }
}
