package O91;

import Au.ViewOnClickListenerC13080b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import ru.mts.biometry.sdk.view.SdkBioRadioButton;

/* loaded from: classes9.dex */
public final class r extends B {

    /* renamed from: f, reason: collision with root package name */
    public static final p f12070f = new p();

    /* renamed from: e, reason: collision with root package name */
    public final a f12071e;

    public r(a aVar) {
        super(f12070f);
        this.f12071e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        q qVar = (q) c12;
        M91.c cVar = (M91.c) getItem(i12);
        r rVar = qVar.f12069c;
        boolean z12 = rVar.getItemCount() != 1;
        SdkBioRadioButton sdkBioRadioButton = qVar.f12068b;
        sdkBioRadioButton.setEnabled(z12);
        sdkBioRadioButton.setText(cVar.f10436b);
        sdkBioRadioButton.setChecked(cVar.f10437c);
        sdkBioRadioButton.setOnClickListener(new ViewOnClickListenerC13080b(12, rVar, cVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new q(this, new SdkBioRadioButton(viewGroup.getContext(), null, 2, null));
    }
}
