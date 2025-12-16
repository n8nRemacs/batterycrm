package com.avito.android.item_report;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.AdvertReport;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.B6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.V0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ItemReportPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_report/n;", "Lcom/avito/android/item_report/m;", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f173877a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f173878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173879c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f173880d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public AdvertReport f173881e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ItemReportFragment f173882f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public y f173883g;

    /* compiled from: ItemReportPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertReport;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/AdvertReport;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Drawable drawable;
            Context context;
            Drawable drawable2;
            Context context2;
            AdvertReport advertReport = (AdvertReport) obj;
            n nVar = n.this;
            y yVar = nVar.f173883g;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            nVar.f173883g = null;
            ItemReportFragment itemReportFragment = nVar.f173882f;
            if (itemReportFragment != null) {
                com.avito.android.progress_overlay.l lVar = itemReportFragment.f173855p0;
                if (lVar != null) {
                    lVar.j();
                }
                AttributedText legalInfo = advertReport.getLegalInfo();
                if (legalInfo != null) {
                    com.avito.android.util.text.h hVar = new com.avito.android.util.text.h();
                    Editable editableNewEditable = Editable.Factory.getInstance().newEditable(legalInfo.getText());
                    com.avito.android.util.text.g gVar = new com.avito.android.util.text.g(legalInfo, hVar);
                    hVar.f319082a.getClass();
                    D5.a(editableNewEditable, gVar);
                    if (C43066x.q(editableNewEditable, "{{", false) || C43066x.q(editableNewEditable, "}}", false)) {
                        editableNewEditable = null;
                    }
                    if (editableNewEditable != null) {
                        TextView textView = itemReportFragment.f173860u0;
                        if (textView != null) {
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                        }
                        TextView textView2 = itemReportFragment.f173860u0;
                        if (textView2 != null) {
                            textView2.setText(editableNewEditable);
                        }
                        TextView textView3 = itemReportFragment.f173860u0;
                        if (textView3 != null) {
                            D6.H(textView3);
                        }
                    }
                }
                B6 b62 = B6.f318559a;
                TextView textView4 = itemReportFragment.f173856q0;
                String header = advertReport.getHeader();
                b62.getClass();
                if (textView4 != null) {
                    I5.a(textView4, header, false);
                }
                TextView textView5 = itemReportFragment.f173857r0;
                String number = advertReport.getNumber();
                if (textView5 != null) {
                    I5.a(textView5, number, false);
                }
                TextView textView6 = itemReportFragment.f173858s0;
                String status = advertReport.getStatus();
                if (textView6 != null) {
                    I5.a(textView6, status, false);
                }
                TextView textView7 = itemReportFragment.f173859t0;
                String date = advertReport.getDate();
                if (textView7 != null) {
                    I5.a(textView7, date, false);
                }
                LinearLayout linearLayout = itemReportFragment.f173861v0;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                View view = itemReportFragment.getView();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(view != null ? view.getContext() : null);
                List<AdvertReport.Result> results = advertReport.getResults();
                if (results != null) {
                    for (AdvertReport.Result result : results) {
                        TextView textView8 = (TextView) layoutInflaterFrom.inflate(R.layout.item_report_result, (ViewGroup) itemReportFragment.f173861v0, false);
                        LinearLayout linearLayout2 = itemReportFragment.f173861v0;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(textView8);
                        }
                        textView8.setText(result.getTitle());
                        if (result instanceof AdvertReport.OkResult) {
                            LinearLayout linearLayout3 = itemReportFragment.f173861v0;
                            if (linearLayout3 == null || (context = linearLayout3.getContext()) == null || (drawable = context.getDrawable(R.drawable.ic_good_24)) == null) {
                                drawable = null;
                            } else {
                                V0.d(drawable, C35835l0.d(R.attr.green, itemReportFragment.requireActivity()));
                            }
                            textView8.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        } else if (result instanceof AdvertReport.WarnResult) {
                            LinearLayout linearLayout4 = itemReportFragment.f173861v0;
                            if (linearLayout4 == null || (context2 = linearLayout4.getContext()) == null || (drawable2 = context2.getDrawable(R.drawable.ic_error_24)) == null) {
                                drawable2 = null;
                            } else {
                                V0.d(drawable2, C35835l0.d(R.attr.orange, itemReportFragment.requireActivity()));
                            }
                            textView8.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ItemReportPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            n nVar = n.this;
            y yVar = nVar.f173883g;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            nVar.f173883g = null;
            ItemReportFragment itemReportFragment = nVar.f173882f;
            if (itemReportFragment == null) {
                return;
            }
            if (K5.e(th2)) {
                com.avito.android.progress_overlay.l lVar = itemReportFragment.f173855p0;
                if (lVar != null) {
                    lVar.a("");
                    return;
                }
                return;
            }
            PrintableText printableTextA = InterfaceC35741a1.a.a(nVar.f173880d, th2, null, null, 6);
            com.avito.android.item_report.a aVar = itemReportFragment.f173854o0;
            if (aVar != null) {
                aVar.onError(printableTextA.k0(itemReportFragment.requireContext()));
            }
        }
    }

    public n(@Y61.k String str, @Y61.k l lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f173877a = str;
        this.f173878b = lVar;
        this.f173879c = interfaceC35745a5;
        this.f173880d = interfaceC35741a1;
    }

    public final void a() {
        Drawable drawable;
        Context context;
        Drawable drawable2;
        Context context2;
        ItemReportFragment itemReportFragment = this.f173882f;
        if (itemReportFragment == null) {
            return;
        }
        AdvertReport advertReport = this.f173881e;
        if (advertReport == null) {
            if (this.f173883g == null) {
                com.avito.android.progress_overlay.l lVar = itemReportFragment.f173855p0;
                if (lVar != null) {
                    lVar.k(null);
                }
                z<AdvertReport> zVarA = this.f173878b.f173876a.a(this.f173877a);
                InterfaceC35745a5 interfaceC35745a5 = this.f173879c;
                this.f173883g = (y) zVarA.j0(interfaceC35745a5.e()).x0(interfaceC35745a5.a()).v0(new a(), new b(), io.reactivex.rxjava3.internal.functions.a.f401993c);
                return;
            }
            return;
        }
        y yVar = this.f173883g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f173883g = null;
        ItemReportFragment itemReportFragment2 = this.f173882f;
        if (itemReportFragment2 != null) {
            com.avito.android.progress_overlay.l lVar2 = itemReportFragment2.f173855p0;
            if (lVar2 != null) {
                lVar2.j();
            }
            AttributedText legalInfo = advertReport.getLegalInfo();
            if (legalInfo != null) {
                com.avito.android.util.text.h hVar = new com.avito.android.util.text.h();
                Editable editableNewEditable = Editable.Factory.getInstance().newEditable(legalInfo.getText());
                com.avito.android.util.text.g gVar = new com.avito.android.util.text.g(legalInfo, hVar);
                hVar.f319082a.getClass();
                D5.a(editableNewEditable, gVar);
                if (C43066x.q(editableNewEditable, "{{", false) || C43066x.q(editableNewEditable, "}}", false)) {
                    editableNewEditable = null;
                }
                if (editableNewEditable != null) {
                    TextView textView = itemReportFragment2.f173860u0;
                    if (textView != null) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    TextView textView2 = itemReportFragment2.f173860u0;
                    if (textView2 != null) {
                        textView2.setText(editableNewEditable);
                    }
                    TextView textView3 = itemReportFragment2.f173860u0;
                    if (textView3 != null) {
                        D6.H(textView3);
                    }
                }
            }
            B6 b62 = B6.f318559a;
            TextView textView4 = itemReportFragment2.f173856q0;
            String header = advertReport.getHeader();
            b62.getClass();
            if (textView4 != null) {
                I5.a(textView4, header, false);
            }
            TextView textView5 = itemReportFragment2.f173857r0;
            String number = advertReport.getNumber();
            if (textView5 != null) {
                I5.a(textView5, number, false);
            }
            TextView textView6 = itemReportFragment2.f173858s0;
            String status = advertReport.getStatus();
            if (textView6 != null) {
                I5.a(textView6, status, false);
            }
            TextView textView7 = itemReportFragment2.f173859t0;
            String date = advertReport.getDate();
            if (textView7 != null) {
                I5.a(textView7, date, false);
            }
            LinearLayout linearLayout = itemReportFragment2.f173861v0;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            View view = itemReportFragment2.getView();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(view != null ? view.getContext() : null);
            List<AdvertReport.Result> results = advertReport.getResults();
            if (results != null) {
                for (AdvertReport.Result result : results) {
                    TextView textView8 = (TextView) layoutInflaterFrom.inflate(R.layout.item_report_result, (ViewGroup) itemReportFragment2.f173861v0, false);
                    LinearLayout linearLayout2 = itemReportFragment2.f173861v0;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(textView8);
                    }
                    textView8.setText(result.getTitle());
                    if (result instanceof AdvertReport.OkResult) {
                        LinearLayout linearLayout3 = itemReportFragment2.f173861v0;
                        if (linearLayout3 == null || (context = linearLayout3.getContext()) == null || (drawable = context.getDrawable(R.drawable.ic_good_24)) == null) {
                            drawable = null;
                        } else {
                            V0.d(drawable, C35835l0.d(R.attr.green, itemReportFragment2.requireActivity()));
                        }
                        textView8.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else if (result instanceof AdvertReport.WarnResult) {
                        LinearLayout linearLayout4 = itemReportFragment2.f173861v0;
                        if (linearLayout4 == null || (context2 = linearLayout4.getContext()) == null || (drawable2 = context2.getDrawable(R.drawable.ic_error_24)) == null) {
                            drawable2 = null;
                        } else {
                            V0.d(drawable2, C35835l0.d(R.attr.orange, itemReportFragment2.requireActivity()));
                        }
                        textView8.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
        }
    }
}
