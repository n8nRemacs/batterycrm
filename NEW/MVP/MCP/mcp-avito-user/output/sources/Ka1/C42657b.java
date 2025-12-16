package ka1;

import B91.C13118k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import kotlin.collections.C42784z0;
import ru.mts.biometry.sdk.view.SdkBioTextField;

/* renamed from: ka1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42657b extends RecyclerView.Adapter {

    /* renamed from: c, reason: collision with root package name */
    public Object f406388c = C42784z0.f406748b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f406388c.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        E91.e eVar = (E91.e) this.f406388c.get(i12);
        C13118k c13118k = ((C42656a) c12).f406387b;
        SdkBioTextField sdkBioTextField = c13118k.f1141b;
        if (eVar != null) {
            sdkBioTextField.setFieldLabel(eVar.f3841a);
            String str = eVar.f3842b;
            if (str.length() == 0) {
                str = "–";
            }
            c13118k.f1141b.setFieldValue(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.sdk_bio_item_recognition_page_result_data, null, false);
        SdkBioTextField sdkBioTextField = (SdkBioTextField) g2.d.a(viewB, R.id.item);
        if (sdkBioTextField != null) {
            return new C42656a(new C13118k((FrameLayout) viewB, sdkBioTextField));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewB.getResources().getResourceName(R.id.item)));
    }
}
