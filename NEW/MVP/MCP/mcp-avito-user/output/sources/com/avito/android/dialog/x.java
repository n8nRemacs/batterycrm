package com.avito.android.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DialogWithDeeplinkActions.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class x extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogWithDeeplinkActions f144804l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f144805m;

    /* compiled from: DialogWithDeeplinkActions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144806a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f144807b;

        static {
            int[] iArr = new int[DeepLinksDialogInfo.ControlsDirection.values().length];
            try {
                iArr[DeepLinksDialogInfo.ControlsDirection.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinksDialogInfo.ControlsDirection.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f144806a = iArr;
            int[] iArr2 = new int[DeepLinksDialogInfo.ActionType.values().length];
            try {
                iArr2[DeepLinksDialogInfo.ActionType.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DeepLinksDialogInfo.ActionType.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DeepLinksDialogInfo.ActionType.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f144807b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(DialogWithDeeplinkActions dialogWithDeeplinkActions, Context context) {
        super(2);
        this.f144804l = dialogWithDeeplinkActions;
        this.f144805m = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.lib.design.modal.a.b r9, android.content.DialogInterface r10) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.dialog.x.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
