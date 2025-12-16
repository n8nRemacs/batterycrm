package com.avito.android.compose_items.views;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.compose_items.views.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeMultiselectPresenterWithContainerBase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/compose_items/views/g;", "LTV0/d;", "Lcom/avito/android/compose_items/views/b;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class g implements TV0.d<b, ParameterElement.v> {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f125438b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f125439c;

    public g() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f125438b = cVar;
        this.f125439c = new C41981q0(cVar);
    }

    @Y61.k
    public abstract C22096n O(@Y61.k ParameterElement.v vVar);

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SpannableString spannableStringA;
        b bVar = (b) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zBooleanValue = getF125416f().w().invoke().booleanValue();
        boolean z12 = vVar.f117556q;
        String str = vVar.f117543d;
        if (zBooleanValue) {
            spannableStringA = getF125415e().a(str, z12, vVar.f117564y);
        } else {
            if (z12) {
                str = "";
            }
            spannableStringA = str;
        }
        spannableStringBuilder.append((CharSequence) spannableStringA);
        if (vVar.f117561v) {
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-54485), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        bVar.setTitle(spannableStringBuilder);
        if (vVar.f117560u != null) {
            bVar.i4(new f(this, vVar));
        } else {
            bVar.i4(null);
        }
        ItemWithState.State state = vVar.f117555p;
        boolean z13 = state instanceof ItemWithState.State.Normal;
        AttributedText attributedText = vVar.f117546g;
        if (z13) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceB = charSequence;
            } else if (attributedText != null) {
                charSequenceB = getF125414d().b(attributedText);
            }
            bVar.u(charSequenceB);
        } else if (state instanceof ItemWithState.State.Warning) {
            b.a.a(bVar, ((ItemWithState.State.Warning) state).f173900b, null, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            bVar.K1(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, attributedText != null ? getF125414d().b(attributedText) : null);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            b.a.a(bVar, null, attributedText != null ? getF125414d().b(attributedText) : null, 1);
        }
        bVar.z7(O(vVar));
    }

    @Y61.k
    /* renamed from: V */
    public abstract Q1 getF125416f();

    @Y61.k
    /* renamed from: Y */
    public abstract InterfaceC35807h4 getF125415e();

    @Y61.k
    /* renamed from: k */
    public abstract com.avito.android.util.text.a getF125414d();
}
