package com.avito.android.beduin.common.actionhandler.update_form_visibility;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.collection.C20199a;
import com.avito.android.beduin.common.actionhandler.update_form_visibility.a;
import com.avito.android.beduin.common.actionhandler.update_form_visibility.e;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinUpdateFormVisibilityConnector.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f100490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a.C3016a f100491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e.a f100492n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, a.C3016a c3016a, e.a aVar) {
        super(0);
        this.f100490l = view;
        this.f100491m = c3016a;
        this.f100492n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        final View view = this.f100490l;
        int measuredHeight = view.getMeasuredHeight();
        final a.C3016a c3016a = this.f100491m;
        if (c3016a.f100483a) {
            measuredHeight = 0;
        }
        e.a aVar = this.f100492n;
        C20199a<String, ViewPropertyAnimator> c20199a = aVar.f100495c;
        String str = c3016a.f100485c;
        ViewPropertyAnimator viewPropertyAnimatorRemove = c20199a.remove(str);
        if (viewPropertyAnimatorRemove != null) {
            viewPropertyAnimatorRemove.cancel();
        }
        final int i12 = 0;
        final int i13 = 1;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().withStartAction(new Runnable() { // from class: com.avito.android.beduin.common.actionhandler.update_form_visibility.c
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (c3016a.f100483a) {
                            D6.H(view);
                            break;
                        }
                        break;
                    default:
                        if (!c3016a.f100483a) {
                            D6.g(view);
                            break;
                        }
                        break;
                }
            }
        }).setDuration(300L).translationY(measuredHeight).withEndAction(new Runnable() { // from class: com.avito.android.beduin.common.actionhandler.update_form_visibility.c
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        if (c3016a.f100483a) {
                            D6.H(view);
                            break;
                        }
                        break;
                    default:
                        if (!c3016a.f100483a) {
                            D6.g(view);
                            break;
                        }
                        break;
                }
            }
        });
        aVar.f100495c.put(str, viewPropertyAnimatorWithEndAction);
        viewPropertyAnimatorWithEndAction.start();
        return G0.f406611a;
    }
}
