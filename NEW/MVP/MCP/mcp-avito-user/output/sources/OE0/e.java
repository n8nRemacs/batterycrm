package oe0;

import Y61.k;
import android.content.Context;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.DescriptionItem;
import com.avito.android.remote.model.category_parameters.ManualVin;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VinManualViewFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loe0/e;", "Loe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC44767d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f419979a;

    @Inject
    public e(@k com.avito.android.util.text.a aVar) {
        this.f419979a = aVar;
    }

    @Override // oe0.InterfaceC44767d
    @k
    public final View a(@k Context context, @k ManualVin manualVin) {
        View viewInflate;
        Uri uriD;
        View view = null;
        View viewInflate2 = View.inflate(context, R.layout.scanner_vin_manual_dialog_view, null);
        View viewFindViewById = viewInflate2.findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        View viewFindViewById2 = viewInflate2.findViewById(R.id.vin_manual_items_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById2;
        View viewInflate3 = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.vin_manual_image_item, (ViewGroup) linearLayout, false);
        Image image = manualVin.getImage();
        if ((viewInflate3 instanceof SimpleDraweeView) && (uriD = C35829k2.c(image, viewInflate3, 1, 22).d()) != null) {
            ImageRequest.a aVarA = C35949t5.a((SimpleDraweeView) viewInflate3);
            aVarA.f(uriD);
            aVarA.c();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        List<DescriptionItem> descriptionList = manualVin.getDescriptionList();
        ArrayList arrayList = new ArrayList();
        for (DescriptionItem descriptionItem : descriptionList) {
            if (descriptionItem.getTitle() == null && descriptionItem.getText() == null) {
                viewInflate = view;
            } else {
                viewInflate = layoutInflaterFrom.inflate(R.layout.vin_manual_description_item, (ViewGroup) linearLayout, false);
                View viewFindViewById3 = viewInflate.findViewById(R.id.title);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById3;
                View viewFindViewById4 = viewInflate.findViewById(R.id.description);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById4;
                CharSequence charSequenceC = this.f419979a.c(viewInflate.getContext(), descriptionItem.getText());
                I5.a(textView, descriptionItem.getTitle(), false);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                I5.a(textView2, charSequenceC, false);
            }
            if (viewInflate != null) {
                arrayList.add(viewInflate);
            }
            view = null;
        }
        linearLayout.addView(viewInflate3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        com.avito.android.lib.design.button.b.a(button, manualVin.getCloseButtonTitle(), false);
        return viewInflate2;
    }
}
