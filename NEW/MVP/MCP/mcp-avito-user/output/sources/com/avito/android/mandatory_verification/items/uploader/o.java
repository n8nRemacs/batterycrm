package com.avito.android.mandatory_verification.items.uploader;

import LV.c;
import VU.a;
import VU.b;
import Y41.p;
import android.content.Context;
import android.text.format.Formatter;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MandatoryVerificationUploaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/o;", "Lcom/avito/android/mandatory_verification/items/uploader/m;", "Lcom/avito/konveyor/adapter/b;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f184709r = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f184710b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f184711c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N f184712d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f184713e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f184714f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f184715g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f184716h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f184717i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f184718j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f184719k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f184720l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f184721m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f184722n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f184723o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f184724p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f184725q;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.a<G0> aVar2) {
        super(view);
        this.f184710b = view;
        this.f184711c = aVar;
        this.f184712d = (N) aVar2;
        this.f184713e = view.getContext();
        this.f184714f = (TextView) view.findViewById(R.id.uploader_title);
        this.f184715g = (TextView) view.findViewById(R.id.uploader_checkmark);
        this.f184716h = (TextView) view.findViewById(R.id.uploader_description);
        this.f184717i = (TextView) view.findViewById(R.id.uploader_action_title);
        this.f184718j = (TextView) view.findViewById(R.id.uploader_action_description);
        this.f184719k = (Button) view.findViewById(R.id.uploader_button);
        this.f184720l = (TextView) view.findViewById(R.id.error_message);
        this.f184721m = (TextView) view.findViewById(R.id.file_name);
        this.f184722n = (TextView) view.findViewById(R.id.file_size);
        this.f184723o = (TextView) view.findViewById(R.id.file_delete_button);
        this.f184724p = (TextView) view.findViewById(R.id.file_icon);
        this.f184725q = (TextView) view.findViewById(R.id.file_error_message);
    }

    @Override // com.avito.android.mandatory_verification.items.uploader.m
    public final void aG(@Y61.k MandatoryVerificationUploaderItem mandatoryVerificationUploaderItem, @Y61.k Y41.l<? super List<String>, G0> lVar, @Y61.k p<? super String, ? super Boolean, G0> pVar) {
        G0 g02;
        I5.a(this.f184714f, mandatoryVerificationUploaderItem.f184669c, false);
        com.avito.android.util.text.j.a(this.f184716h, mandatoryVerificationUploaderItem.f184670d, this.f184711c);
        TextView textView = this.f184717i;
        I5.a(textView, mandatoryVerificationUploaderItem.f184671e, false);
        TextView textView2 = this.f184718j;
        I5.a(textView2, mandatoryVerificationUploaderItem.f184672f, false);
        if (mandatoryVerificationUploaderItem.f184674h) {
            TextView textView3 = this.f184715g;
            D6.H(textView3);
            FV.a.f4720a.getClass();
            FV.a.c(textView3, R.attr.textIconDoneFilled);
        }
        TextView textView4 = this.f184725q;
        Context context = this.f184713e;
        TextView textView5 = this.f184722n;
        TextView textView6 = this.f184721m;
        TextView textView7 = this.f184724p;
        TextView textView8 = this.f184720l;
        Button button = this.f184719k;
        TextView textView9 = this.f184723o;
        MandatoryVerificationUploaderItem.FileItem fileItem = mandatoryVerificationUploaderItem.f184675i;
        if (fileItem != null) {
            D6.w(button);
            D6.w(textView8);
            D6.w(textView);
            D6.w(textView2);
            D6.w(textView8);
            I5.a(textView6, fileItem.f184683c, false);
            I5.a(textView5, Formatter.formatShortFileSize(context, fileItem.f184684d), false);
            FV.a.f4720a.getClass();
            FV.a.c(textView7, R.attr.textIconFile);
            D6.H(textView7);
            FV.a.c(textView9, R.attr.textIconDelete);
            textView9.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(pVar, fileItem));
            D6.H(textView9);
            I5.a(textView4, fileItem.f184686f, false);
            g02 = G0.f406611a;
        } else {
            MandatoryVerificationUploaderItem.Button button2 = mandatoryVerificationUploaderItem.f184673g;
            if (button2 != null) {
                D6.w(textView6);
                D6.w(textView7);
                D6.w(textView5);
                D6.w(textView9);
                D6.w(textView4);
                D6.H(button);
                button.setState(new UU.a(button2.f184679b, null, false, false, false, new n(lVar, mandatoryVerificationUploaderItem.f184677k), C35835l0.h(R.attr.ic_upload20, context), null, null, false, 926, null));
                b.a aVar = VU.b.f17147t;
                int iD2 = com.avito.android.lib.util.f.d(button2.f184680c);
                aVar.getClass();
                VU.b bVar = (VU.b) c.a.a(aVar, context, iD2);
                String str = mandatoryVerificationUploaderItem.f184676j;
                button.setStyle(VU.b.a(bVar, str != null ? new a.C1180a(androidx.core.content.d.getDrawable(context, R.drawable.bg_button_error)) : bVar.f17149a, null, null, null, null, 0, 0, 0, 0, null, 262142));
                I5.a(textView8, str, false);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
        }
        if (g02 == null) {
            D6.w(button);
        }
        Integer num = mandatoryVerificationUploaderItem.f184678l;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.f184710b;
            D6.c(view, null, null, null, Integer.valueOf(D6.j(view, iIntValue)), 7);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f184712d.invoke();
    }
}
