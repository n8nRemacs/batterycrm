package com.avito.android.publish.items.file_uploader;

import Y41.p;
import android.content.Context;
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
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.publish.file_uploader.o;
import com.avito.android.remote.model.category_parameters.FileState;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FileUploaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/file_uploader/l;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f236820i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f236821b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f236822c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f236823d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f236824e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f236825f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f236826g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f236827h;

    public l(@Y61.k View view, @Y61.k o oVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f236821b = oVar;
        this.f236822c = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.upload);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f236823d = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.files);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f236824e = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f236825f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f236826g = (TextView) viewFindViewById4;
        this.f236827h = new io.reactivex.rxjava3.disposables.c();
    }

    public final void B80(@Y61.k p pVar, @Y61.l List list) {
        int i12;
        LinearLayout linearLayout = this.f236824e;
        linearLayout.removeAllViews();
        io.reactivex.rxjava3.disposables.c cVar = this.f236827h;
        cVar.e();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FileUploadParameterValue fileUploadParameterValue = (FileUploadParameterValue) it.next();
                String message = null;
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.file_upload_item, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.uploaded);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.title);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewInflate.findViewById(R.id.size);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById3;
                View viewFindViewById4 = viewInflate.findViewById(R.id.delete);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView2 = (ImageView) viewFindViewById4;
                View viewFindViewById5 = viewInflate.findViewById(R.id.progress_bar);
                if (viewFindViewById5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar.ProgressBar");
                }
                ProgressBar progressBar = (ProgressBar) viewFindViewById5;
                View viewFindViewById6 = viewInflate.findViewById(R.id.error_message);
                if (viewFindViewById6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView3 = (TextView) viewFindViewById6;
                FileState state = fileUploadParameterValue.getState();
                viewInflate.setTag(fileUploadParameterValue.getId());
                textView.setText(fileUploadParameterValue.getName());
                Context context = viewInflate.getContext();
                if (L.f(state, FileState.Idle.INSTANCE)) {
                    i12 = R.attr.black;
                } else {
                    if (!(state instanceof FileState.Loading ? true : state instanceof FileState.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.gray54;
                }
                textView.setTextColor(C35835l0.d(i12, context));
                Long size = fileUploadParameterValue.getSize();
                I5.a(textView2, size != null ? Formatter.formatShortFileSize(viewInflate.getContext(), size.longValue()) : null, false);
                imageView.setVisibility(fileUploadParameterValue.isUploaded() ? 0 : 8);
                boolean z12 = state instanceof FileState.Loading;
                FileState.Loading loading = z12 ? (FileState.Loading) state : null;
                progressBar.setProgress(loading != null ? loading.getProgress() : 0.0f);
                progressBar.setVisibility(z12 ? 0 : 8);
                boolean z13 = state instanceof FileState.Error;
                textView3.setVisibility(z13 ? 0 : 8);
                FileState.Error error = z13 ? (FileState.Error) state : null;
                if (error != null) {
                    message = error.getMessage();
                }
                textView3.setText(message);
                imageView2.setOnClickListener(new j(pVar, fileUploadParameterValue, 0));
                C41981q0 f235703b = this.f236821b.getF235703b();
                InterfaceC35745a5 interfaceC35745a5 = this.f236822c;
                cVar.b(f235703b.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).t0(new k(viewInflate, progressBar)));
                linearLayout.addView(viewInflate);
            }
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f236827h.e();
    }
}
