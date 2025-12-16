package Hj;

import A91.p;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.d;
import androidx.compose.runtime.internal.P;
import com.akita.view.component.fieldset.Fieldset;
import com.avito.android.R;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.validation.InterfaceC36016k;
import g3.C40524a;
import j.I;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PublishFieldSetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHj/c;", "Lcom/avito/konveyor/adapter/b;", "LHj/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c extends com.avito.konveyor.adapter.b implements InterfaceC13997b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f7652l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f7653b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f7654c;

    /* renamed from: d, reason: collision with root package name */
    public final Fieldset f7655d;

    /* renamed from: e, reason: collision with root package name */
    public final View f7656e;

    /* renamed from: f, reason: collision with root package name */
    public final View f7657f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f7658g;

    /* renamed from: h, reason: collision with root package name */
    public final Badge f7659h;

    /* renamed from: i, reason: collision with root package name */
    public final Badge f7660i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7661j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7662k;

    public c(@k View view, @I int i12, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f7653b = aVar;
        d dVar = new d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f7654c = dVar;
        Fieldset fieldset = (Fieldset) view.findViewById(R.id.publish_field_set);
        this.f7655d = fieldset;
        this.f7656e = View.inflate(dVar, i12, null);
        View viewInflate = View.inflate(dVar, R.layout.view_publish_title_actions, null);
        this.f7657f = viewInflate;
        this.f7658g = (ImageView) viewInflate.findViewById(R.id.publish_title_action_help);
        this.f7659h = (Badge) viewInflate.findViewById(R.id.publish_title_action_dot);
        this.f7660i = (Badge) viewInflate.findViewById(R.id.publish_title_action_text_badge);
        TextView textView = (TextView) fieldset.findViewById(R.id.fieldset_hint);
        TextView textView2 = (TextView) fieldset.findViewById(R.id.fieldset_title);
        TextView textView3 = (TextView) fieldset.findViewById(R.id.fieldset_description);
        this.f7661j = fieldset.getPaddingTop();
        this.f7662k = fieldset.getPaddingBottom();
        D6.w(textView);
        D6.w(textView2);
        D6.w(textView3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // Hj.InterfaceC13997b
    public final void a60(@k C13996a c13996a) {
        CharSequence charSequence;
        C40524a.AbstractC11185a c11186a;
        CharSequence charSequenceC;
        CharSequence charSequenceC2;
        CharSequence charSequenceC3;
        p pVar = new p(c13996a, 3);
        ImageView imageView = this.f7658g;
        imageView.setOnClickListener(pVar);
        D6.G(imageView, c13996a.f7649g != null);
        D6.G(this.f7659h, c13996a.f7646d);
        String str = c13996a.f7651i;
        boolean z12 = !(str == null || C43066x.K(str));
        Badge badge = this.f7660i;
        D6.G(badge, z12);
        if (str == null) {
            str = "";
        }
        badge.setTitleText(str);
        Fieldset fieldset = this.f7655d;
        String str2 = c13996a.f7643a;
        fieldset.setTag(str2);
        com.avito.android.util.text.a aVar = this.f7653b;
        d dVar = this.f7654c;
        C40524a.AbstractC11185a.b bVar = null;
        CharSequence charSequenceC4 = c13996a.f7647e;
        if (charSequenceC4 == null) {
            AttributedText attributedText = c13996a.f7648f;
            if (attributedText != null) {
                charSequenceC4 = aVar.c(dVar, attributedText);
                charSequence = charSequenceC4;
            } else {
                charSequence = null;
            }
        } else {
            charSequence = charSequenceC4;
        }
        C40524a.b c11187a = (c13996a.f7645c || str2.length() == 0) ? null : (charSequence == null || charSequence.length() == 0) ? new C40524a.b.C11187a(c13996a.f7643a, this.f7657f, false, 4, null) : new C40524a.b.C11188b(c13996a.f7643a, this.f7657f, false, false, charSequence, 12, null);
        ItemWithState.State state = c13996a.f7644b;
        boolean z13 = state instanceof ItemWithState.State.Error.ErrorWithMessage;
        AttributedText attributedText2 = c13996a.f7650h;
        if (z13) {
            ItemWithState.State.Error.ErrorWithMessage errorWithMessage = (ItemWithState.State.Error.ErrorWithMessage) state;
            if (InterfaceC36016k.a.a(errorWithMessage.f173897b)) {
                c11186a = new C40524a.AbstractC11185a.C11186a(errorWithMessage.f173897b);
            } else {
                if (attributedText2 != null && (charSequenceC3 = aVar.c(dVar, attributedText2)) != null) {
                    bVar = new C40524a.AbstractC11185a.b(charSequenceC3);
                }
                c11186a = bVar;
            }
            B80();
        } else if (state instanceof ItemWithState.State.Warning) {
            ItemWithState.State.Warning warning = (ItemWithState.State.Warning) state;
            if (InterfaceC36016k.a.a(warning.f173900b)) {
                c11186a = new C40524a.AbstractC11185a.C11186a(warning.f173900b);
            } else {
                if (attributedText2 != null && (charSequenceC2 = aVar.c(dVar, attributedText2)) != null) {
                    bVar = new C40524a.AbstractC11185a.b(charSequenceC2);
                }
                c11186a = bVar;
            }
            B80();
        } else {
            if (!(L.f(state, ItemWithState.State.Error.ErrorWithoutMessage.f173898b) ? true : state instanceof ItemWithState.State.Normal)) {
                throw new NoWhenBranchMatchedException();
            }
            if (attributedText2 != null && (charSequenceC = aVar.c(dVar, attributedText2)) != null) {
                bVar = new C40524a.AbstractC11185a.b(charSequenceC);
            }
            C80();
            c11186a = bVar;
        }
        fieldset.setState(new C40524a(c11187a, c11186a, Collections.singletonList(this.f7656e)));
    }

    @Override // Hj.InterfaceC13997b
    public final void k0(@l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        D6.f(this.f7655d, 0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? this.f7661j : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? this.f7662k : y6.d(bottom.intValue()), 5);
    }

    @Override // Hj.InterfaceC13997b
    public void setEnabled(boolean z12) {
        this.f7655d.setEnabled(z12);
    }

    public void B80() {
    }

    public void C80() {
    }
}
