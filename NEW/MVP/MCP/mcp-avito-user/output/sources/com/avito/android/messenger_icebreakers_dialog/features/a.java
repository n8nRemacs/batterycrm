package com.avito.android.messenger_icebreakers_dialog.features;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: MessengerIcebreakerDialogFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/features/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f197659d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f197660b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f197661c;

    static {
        h0 h0Var = new h0(a.class, "abMessengerIcebreakerDialog", "getAbMessengerIcebreakerDialog()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f197659d = new n[]{n0Var.i(h0Var), C0.k(a.class, "skipEmptyMessageCondition", "getSkipEmptyMessageCondition()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210390A3;
        this.f197660b = A0.u(this, "Показ шторки c айсбрекерами при нажатии на \"Написать\" ", "tac_abMessengerIcebreakerDialogV2", Boolean.TRUE, true, 0, owners, 40);
        this.f197661c = A0.u(this, "Шторка c айсбрекерами при нажатии. игнорирования правила пустого чата", "tac_abMessengerIcebreakerDialogSkipEmptyChatCondition", Boolean.FALSE, true, 0, owners, 40);
    }
}
