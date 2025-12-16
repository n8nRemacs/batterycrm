package S7;

import Au.ViewOnClickListenerC13080b;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeleteCollectionBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-collection-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {
    public static final void a(@k Y41.a aVar, @k d dVar) {
        View viewInflate = ((LayoutInflater) dVar.getContext().getSystemService("layout_inflater")).inflate(R.layout.advert_collection_shared_delete_collection_dialog, (ViewGroup) null);
        dVar.G(viewInflate, true);
        d.M(dVar, null, false, true, 7);
        View viewFindViewById = viewInflate.findViewById(R.id.delete_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById).setOnClickListener(new ViewOnClickListenerC13080b(aVar, dVar));
        View viewFindViewById2 = viewInflate.findViewById(R.id.cancel_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById2).setOnClickListener(new a(dVar, 0));
        View viewFindViewById3 = viewInflate.findViewById(R.id.close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById3).setOnClickListener(new a(dVar, 1));
    }
}
