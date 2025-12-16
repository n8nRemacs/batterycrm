package ru.mts.biometry.sdk.feature.recognition.ui.result;

import B91.I;
import Ba1.k;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.N0;
import com.avito.android.R;
import g2.c;
import g2.d;
import ka1.C42657b;
import ka1.e;
import ka1.f;
import ka1.j;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/recognition/ui/result/g;", "Lru/mts/biometry/sdk/base/b;", "LB91/I;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class g extends b<I> {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436504j0 = {m0.f406844a.i(new h0(g.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/recognition/ui/result/RecognitionPageResultViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final C42657b f436505h0;

    /* renamed from: i0, reason: collision with root package name */
    public final k f436506i0;

    public g() {
        super(0);
        this.f436505h0 = new C42657b();
        this.f436506i0 = new k(j.class, new f(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_recognition_page_result, (ViewGroup) null, false);
        int i12 = R.id.btn_accept;
        SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btn_accept);
        if (sdkBioButton != null) {
            i12 = R.id.btn_retry;
            SdkBioButton sdkBioButton2 = (SdkBioButton) d.a(viewInflate, R.id.btn_retry);
            if (sdkBioButton2 != null) {
                i12 = R.id.rv_results_list;
                RecyclerView recyclerView = (RecyclerView) d.a(viewInflate, R.id.rv_results_list);
                if (recyclerView != null) {
                    i12 = R.id.scrollView;
                    if (((NestedScrollView) d.a(viewInflate, R.id.scrollView)) != null) {
                        i12 = R.id.toolbar;
                        SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                        if (sdkBioToolbar != null) {
                            i12 = R.id.tv_doc_result_description;
                            TextView textView = (TextView) d.a(viewInflate, R.id.tv_doc_result_description);
                            if (textView != null) {
                                i12 = R.id.tv_doc_result_title;
                                TextView textView2 = (TextView) d.a(viewInflate, R.id.tv_doc_result_title);
                                if (textView2 != null) {
                                    i12 = R.id.tv_info;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) d.a(viewInflate, R.id.tv_info);
                                    if (appCompatTextView != null) {
                                        return new I((LinearLayout) viewInflate, sdkBioButton, sdkBioButton2, recyclerView, sdkBioToolbar, textView, textView2, appCompatTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        AppCompatTextView appCompatTextView;
        SdkBioToolbar sdkBioToolbar;
        I i14 = (I) this.f436376g0;
        if (i14 != null && (sdkBioToolbar = i14.f1066e) != null) {
            H91.g.a(i12, 0, 13, sdkBioToolbar);
        }
        I i15 = (I) this.f436376g0;
        if (i15 == null || (appCompatTextView = i15.f1069h) == null) {
            return;
        }
        H91.g.a(0, i13, 7, appCompatTextView);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        I i12 = (I) cVar;
        RecyclerView recyclerView = i12.f1065d;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(this.f436505h0);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(this, i12, null), 3);
        final int i13 = 0;
        Ca1.d.a(new View.OnClickListener(this) { // from class: ka1.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406399c;

            {
                this.f406399c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406399c;
                switch (i13) {
                    case 0:
                        n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i14 = (I) gVar.f436376g0;
                        if (i14 != null) {
                            i14.f1064c.enableLoader();
                            i14.f1063b.setEnabled(false);
                            n nVar = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar), C43262l0.f411947c, null, new i(jVar, null), 2);
                            break;
                        }
                        break;
                    case 1:
                        n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i15 = (I) gVar.f436376g0;
                        if (i15 != null) {
                            i15.f1064c.enableLoader();
                            i15.f1063b.setEnabled(false);
                            n nVar2 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar2 = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar2), C43262l0.f411947c, null, new i(jVar2, null), 2);
                            break;
                        }
                        break;
                    default:
                        n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i16 = (I) gVar.f436376g0;
                        if (i16 != null) {
                            i16.f1063b.enableLoader();
                            i16.f1064c.setEnabled(false);
                            n nVar3 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar3 = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar3), C43262l0.f411947c, null, new h(jVar3, null), 2);
                            break;
                        }
                        break;
                }
            }
        }, i12.f1064c);
        final int i14 = 1;
        i12.f1066e.setOnBackListener(new View.OnClickListener(this) { // from class: ka1.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406399c;

            {
                this.f406399c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406399c;
                switch (i14) {
                    case 0:
                        n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i142 = (I) gVar.f436376g0;
                        if (i142 != null) {
                            i142.f1064c.enableLoader();
                            i142.f1063b.setEnabled(false);
                            n nVar = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar), C43262l0.f411947c, null, new i(jVar, null), 2);
                            break;
                        }
                        break;
                    case 1:
                        n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i15 = (I) gVar.f436376g0;
                        if (i15 != null) {
                            i15.f1064c.enableLoader();
                            i15.f1063b.setEnabled(false);
                            n nVar2 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar2 = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar2), C43262l0.f411947c, null, new i(jVar2, null), 2);
                            break;
                        }
                        break;
                    default:
                        n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i16 = (I) gVar.f436376g0;
                        if (i16 != null) {
                            i16.f1063b.enableLoader();
                            i16.f1064c.setEnabled(false);
                            n nVar3 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar3 = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar3), C43262l0.f411947c, null, new h(jVar3, null), 2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        Ca1.d.a(new View.OnClickListener(this) { // from class: ka1.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406399c;

            {
                this.f406399c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406399c;
                switch (i15) {
                    case 0:
                        n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i142 = (I) gVar.f436376g0;
                        if (i142 != null) {
                            i142.f1064c.enableLoader();
                            i142.f1063b.setEnabled(false);
                            n nVar = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar), C43262l0.f411947c, null, new i(jVar, null), 2);
                            break;
                        }
                        break;
                    case 1:
                        n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i152 = (I) gVar.f436376g0;
                        if (i152 != null) {
                            i152.f1064c.enableLoader();
                            i152.f1063b.setEnabled(false);
                            n nVar2 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar2 = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar2), C43262l0.f411947c, null, new i(jVar2, null), 2);
                            break;
                        }
                        break;
                    default:
                        n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
                        I i16 = (I) gVar.f436376g0;
                        if (i16 != null) {
                            i16.f1063b.enableLoader();
                            i16.f1064c.setEnabled(false);
                            n nVar3 = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
                            j jVar3 = (j) gVar.f436506i0.a(gVar);
                            C43259k.d(N0.a(jVar3), C43262l0.f411947c, null, new h(jVar3, null), 2);
                            break;
                        }
                        break;
                }
            }
        }, i12.f1063b);
    }
}
