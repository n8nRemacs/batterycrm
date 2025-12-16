package com.avito.android.blueprints.job_suggest;

import Y61.k;
import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.di.B;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.input.Input;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JobSuggestInstitutesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/blueprints/job_suggest/c;", "LTV0/d;", "Lcom/avito/android/blueprints/job_suggest/f;", "Lcom/avito/android/category_parameters/ParameterElement$r;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes11.dex */
public final class c implements TV0.d<f, ParameterElement.r> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43108m f106041b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43160i<a> f106042c;

    /* compiled from: JobSuggestInstitutesPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/job_suggest/c$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f106043a;

        /* renamed from: b, reason: collision with root package name */
        public final long f106044b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SelectedSuggestInstitute f106045c;

        public a(@k String str, long j12, @k SelectedSuggestInstitute selectedSuggestInstitute) {
            this.f106043a = str;
            this.f106044b = j12;
            this.f106045c = selectedSuggestInstitute;
        }
    }

    @Inject
    public c() {
        C43108m c43108mA = A.a(1, BufferOverflow.f410779d, null, 4);
        this.f106041b = c43108mA;
        this.f106042c = C43175k.Q(c43108mA);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ParameterElement.r rVar = (ParameterElement.r) aVar;
        fVar.f106051c.setTitle(rVar.f117528e);
        String str = rVar.f117529f;
        Input input = fVar.f106050b;
        input.setHint(str);
        input.setOnClickListener(new j(12, new d(rVar, this)));
        String str2 = rVar.f117532i.f291980c;
        if (str2 == null) {
            str2 = "";
        }
        Input.t(input, str2, false, 6);
        input.setEllipsize(TextUtils.TruncateAt.END);
        ItemWithState.State state = rVar.f117531h;
        if (state instanceof ItemWithState.State.Normal) {
            fVar.B80(null);
            return;
        }
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            fVar.B80(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Warning) {
            fVar.B80(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            fVar.B80("");
        }
    }
}
