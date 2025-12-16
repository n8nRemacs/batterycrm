package E40;

import Y61.k;
import Y61.l;
import android.widget.TextView;
import com.avito.android.onboarding.dialog.di.i;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.onboarding.dialog.view.preview.OnboardingPreviewItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingPreviewPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE40/d;", "LE40/c;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A40.a f3747a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f3748b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public g f3749c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f3750d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f3751e;

    @Inject
    public d(@k A40.a aVar, @i @l String str) {
        this.f3747a = aVar;
        this.f3748b = str;
        this.f3751e = new ArrayList();
    }

    @Override // E40.c
    public final void I8(@l AttributedText attributedText) {
        this.f3750d = attributedText != null ? attributedText.getText() : null;
        g gVar = this.f3749c;
        if (gVar != null) {
            TextView textView = gVar.f3758e;
            if (attributedText != null) {
                if (textView == null) {
                    return;
                }
                textView.setText(gVar.f3756c.c(gVar.f3754a.getContext(), attributedText));
            } else if (textView != null) {
                D6.w(textView);
            }
        }
    }

    @Override // E40.c
    public final void J8(@k g gVar) {
        this.f3749c = gVar;
    }

    @Override // E40.c
    public final void K8(@k OnboardingResultItem.OnboardingResultPreviewItem onboardingResultPreviewItem) {
        ArrayList arrayList = this.f3751e;
        arrayList.clear();
        ArrayList arrayList2 = onboardingResultPreviewItem.f208916c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((OnboardingPreviewItem) it.next());
            }
        }
    }

    @Override // D40.d
    public final void a() {
        this.f3749c = null;
    }

    @Override // D40.d
    public final void fa() {
        g gVar = this.f3749c;
        if (gVar != null) {
            gVar.f3755b.m(this.f3751e);
        }
        A40.a aVar = this.f3747a;
        aVar.a(this.f3748b);
        aVar.c(1, this.f3750d);
    }

    public /* synthetic */ d(A40.a aVar, String str, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : str);
    }
}
