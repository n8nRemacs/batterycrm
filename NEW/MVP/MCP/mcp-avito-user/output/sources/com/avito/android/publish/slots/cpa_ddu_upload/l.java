package com.avito.android.publish.slots.cpa_ddu_upload;

import Y41.p;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.category_parameters.FileState;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpaReassignmentSlotView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/cpa_ddu_upload/l;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f243362g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f243363b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f243364c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f243365d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f243366e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f243367f;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.upload);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243363b = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.files);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f243364c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243365d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243366e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243367f = (TextView) viewFindViewById5;
    }

    public final void B80(@Y61.k p pVar, @Y61.l List list) {
        LinearLayout linearLayout = this.f243364c;
        linearLayout.removeAllViews();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FileUploadParameterValue fileUploadParameterValue = (FileUploadParameterValue) it.next();
                String message = null;
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.file_uploader_redesign, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.uploaded);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.title);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewInflate.findViewById(R.id.size);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView3 = (TextView) viewFindViewById3;
                View viewFindViewById4 = viewInflate.findViewById(R.id.delete);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById4;
                View viewFindViewById5 = viewInflate.findViewById(R.id.error_message);
                if (viewFindViewById5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView4 = (TextView) viewFindViewById5;
                View viewFindViewById6 = viewInflate.findViewById(R.id.loading_progress);
                if (viewFindViewById6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
                }
                Spinner spinner = (Spinner) viewFindViewById6;
                FileState state = fileUploadParameterValue.getState();
                viewInflate.setTag(fileUploadParameterValue.getId());
                textView2.setText(fileUploadParameterValue.getName());
                if (state instanceof FileState.Loading) {
                    spinner.setVisibility(0);
                } else {
                    spinner.setVisibility(8);
                    FV.a.f4720a.getClass();
                    FV.a.c(textView, R.attr.textIconFile);
                }
                Long size = fileUploadParameterValue.getSize();
                I5.a(textView3, size != null ? Formatter.formatShortFileSize(viewInflate.getContext(), size.longValue()) : null, false);
                textView.setVisibility(0);
                boolean z12 = state instanceof FileState.Error;
                textView4.setVisibility(z12 ? 0 : 8);
                FileState.Error error = z12 ? (FileState.Error) state : null;
                if (error != null) {
                    message = error.getMessage();
                }
                textView4.setText(message);
                imageView.setOnClickListener(new com.avito.android.publish.items.file_uploader.j(pVar, fileUploadParameterValue, 1));
                linearLayout.addView(viewInflate);
            }
        }
    }
}
