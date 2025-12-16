package com.avito.android.beduin.common.component.file_uploader.file;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import android.text.format.Formatter;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FileItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/file/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/file_uploader/file/g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f101281g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f101282b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f101283c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f101284d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ProgressBar f101285e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f101286f;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f101282b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_size);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f101283c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_delete);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f101284d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.progress_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar.ProgressBar");
        }
        this.f101285e = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_error_message);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f101286f = (TextView) viewFindViewById5;
    }

    public static void B80(TextView textView, String str, String str2, int i12) {
        textView.setText(str);
        Integer numQ = com.avito.android.lib.util.f.q(str2);
        if (numQ != null) {
            textView.setTextAppearance(C35835l0.j(numQ.intValue(), new ContextThemeWrapper(textView.getContext(), i12)));
        }
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void A30(@k String str, @k String str2, @k BeduinComponentTheme beduinComponentTheme) {
        B80(this.f101282b, str, str2, beduinComponentTheme.f100608b);
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void J3(boolean z12) {
        this.f101285e.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void JK(long j12, @k String str, @k BeduinComponentTheme beduinComponentTheme) {
        TextView textView = this.f101283c;
        B80(textView, Formatter.formatShortFileSize(textView.getContext(), j12), str, beduinComponentTheme.f100608b);
        textView.setTextColor(C35835l0.d(R.attr.gray54, textView.getContext()));
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void L5(@k Y41.a<G0> aVar) {
        this.f101284d.setOnClickListener(new ViewOnClickListenerC13121a(20, aVar));
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void Mj(@InterfaceC42150f int i12) {
        TextView textView = this.f101282b;
        textView.setTextColor(C35835l0.d(i12, textView.getContext()));
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void dA(boolean z12) {
        this.f101286f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void hR(@k String str, @k String str2, @k BeduinComponentTheme beduinComponentTheme) {
        int i12 = beduinComponentTheme.f100608b;
        TextView textView = this.f101286f;
        B80(textView, str, str2, i12);
        textView.setTextColor(C35835l0.d(R.attr.red600, textView.getContext()));
    }

    @Override // com.avito.android.beduin.common.component.file_uploader.file.g
    public final void n5(float f12) {
        this.f101285e.setProgress(f12);
    }
}
