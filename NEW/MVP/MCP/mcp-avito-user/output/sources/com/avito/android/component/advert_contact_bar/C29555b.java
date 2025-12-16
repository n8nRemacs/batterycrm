package com.avito.android.component.advert_contact_bar;

import VU.b;
import android.annotation.SuppressLint;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41178c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsActionButtonWithPriorityFactory.kt */
@InterfaceC41178c
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/b;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.component.advert_contact_bar.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29555b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125173a;

    /* compiled from: AdvertDetailsActionButtonWithPriorityFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.component.advert_contact_bar.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ContactBar.Button.Action.Type.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactBar.Button.Action.Type type = ContactBar.Button.Action.Type.f125058b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C29555b(boolean z12) {
        this.f125173a = z12;
    }

    @Y61.k
    @SuppressLint({"InflateParams"})
    public static Button a(@Y61.k ContactBar.Button.Action action, @Y61.k Y41.l lVar, @Y61.k Context context, @Y61.l ArrayList arrayList) {
        Button button = (Button) Q.a(action, context, action.f125049m ? R.layout.advert_details_contact_bar_with_style : R.layout.advert_details_contact_bar_with_style_low_priority);
        String str = action.f125050n;
        if (str != null) {
            b.a aVar = VU.b.f17147t;
            Context context2 = button.getContext();
            aVar.getClass();
            button.setStyle(b.a.b(context2, str));
        }
        String str2 = action.f125052p;
        if (str2 != null) {
            Integer numA = com.avito.android.lib.util.q.a(str2);
            button.setState(new UU.a(null, null, false, false, false, new C29556c(lVar, action), numA != null ? C35835l0.h(numA.intValue(), context) : null, null, null, false, 927, null));
        } else {
            button.setState(new UU.a(action.f125038b, action.f125051o, false, false, false, new C29557d(lVar, action), null, null, null, false, 988, null));
        }
        if (arrayList != null) {
            arrayList.add(button);
        }
        return button;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k java.util.List r25, @Y61.k com.avito.android.advert_core.contactbar.C28266e.h r26, @Y61.k java.util.ArrayList r27, @Y61.k android.content.Context r28, @Y61.l java.util.ArrayList r29) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.component.advert_contact_bar.C29555b.b(java.util.List, com.avito.android.advert_core.contactbar.e$h, java.util.ArrayList, android.content.Context, java.util.ArrayList):void");
    }
}
