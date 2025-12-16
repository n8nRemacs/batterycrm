package com.avito.android.publish.category_edit;

import android.content.res.Resources;
import android.view.View;
import androidx.transition.C23492c;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.publish.category_edit.k;
import com.avito.android.publish.drafts.K;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: CategoryEditSheet.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/category_edit/k$a;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/category_edit/k$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<k.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryEditSheet f232386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f232387m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CategoryEditSheet categoryEditSheet, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(1);
        this.f232386l = categoryEditSheet;
        this.f232387m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(k.a aVar) throws Resources.NotFoundException {
        k.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof k.a.b;
        CategoryEditSheet categoryEditSheet = this.f232386l;
        if (z12) {
            K k12 = categoryEditSheet.f232328h0;
            K k13 = k12 != null ? k12 : null;
            String string = ((k.a.b) aVar2).f232401a;
            if (string == null) {
                string = categoryEditSheet.getResources().getString(R.string.something_went_wrong);
            }
            k13.a(string);
            categoryEditSheet.dismiss();
        } else {
            boolean zF2 = L.f(aVar2, k.a.c.f232402a);
            com.avito.android.lib.design.bottom_sheet.d dVar = this.f232387m;
            if (zF2) {
                View view = categoryEditSheet.f232330j0;
                D6.G(view != null ? view : null, true);
                CategoryEditSheet.b5(categoryEditSheet, dVar, NavigationButtonType.f232336b);
            } else if (aVar2 instanceof k.a.C7066a) {
                View view2 = categoryEditSheet.f232330j0;
                D6.w(view2 != null ? view2 : null);
                k.a.C7066a c7066a = (k.a.C7066a) aVar2;
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, c7066a.f232397a, true, true, 2);
                CategoryEditSheet.b5(categoryEditSheet, dVar, c7066a.f232398b);
                c cVar = new c(categoryEditSheet, c7066a.f232400d, c7066a.f232399c, dVar);
                C23492c c23492c = new C23492c();
                c23492c.G(new androidx.interpolator.view.animation.b());
                c23492c.E(500L);
                q qVar = dVar.f178530x;
                if (qVar != null) {
                    qVar.o(c23492c, cVar);
                }
            } else if (aVar2 instanceof k.a.d) {
                categoryEditSheet.dismiss();
                com.avito.android.publish.screen.step.wizard.b bVar = categoryEditSheet.f232332l0;
                (bVar != null ? bVar : null).J3(((k.a.d) aVar2).f232403a, false);
            }
        }
        return G0.f406611a;
    }
}
