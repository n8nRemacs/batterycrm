package com.avito.android.authorization.gorelkin;

import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParsingPermissionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/authorization/gorelkin/ParsingAllowance;", "kotlin.jvm.PlatformType", "parsingAllowance", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/authorization/gorelkin/ParsingAllowance;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<ParsingAllowance, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParsingPermissionFragment f93896l;

    /* compiled from: ParsingPermissionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93897a;

        static {
            int[] iArr = new int[ParsingAllowance.values().length];
            try {
                ParsingAllowance parsingAllowance = ParsingAllowance.f93859c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParsingAllowance parsingAllowance2 = ParsingAllowance.f93859c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParsingAllowance parsingAllowance3 = ParsingAllowance.f93859c;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93897a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ParsingPermissionFragment parsingPermissionFragment) {
        super(1);
        this.f93896l = parsingPermissionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ParsingAllowance parsingAllowance) {
        ParsingAllowance parsingAllowance2 = parsingAllowance;
        int i12 = parsingAllowance2 == null ? -1 : a.f93897a[parsingAllowance2.ordinal()];
        ParsingPermissionFragment parsingPermissionFragment = this.f93896l;
        if (i12 == 1) {
            ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
            parsingPermissionFragment.r5().setChecked(true);
            parsingPermissionFragment.q5().setChecked(false);
            parsingPermissionFragment.s5().setChecked(false);
        } else if (i12 == 2) {
            ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
            parsingPermissionFragment.r5().setChecked(false);
            parsingPermissionFragment.q5().setChecked(true);
            parsingPermissionFragment.s5().setChecked(false);
        } else if (i12 == 3) {
            ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
            parsingPermissionFragment.r5().setChecked(false);
            parsingPermissionFragment.q5().setChecked(false);
            parsingPermissionFragment.s5().setChecked(true);
        }
        return G0.f406611a;
    }
}
