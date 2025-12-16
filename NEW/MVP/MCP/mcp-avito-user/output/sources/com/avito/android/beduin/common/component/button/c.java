package com.avito.android.beduin.common.component.button;

import Y41.l;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinButtonComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/button/ButtonChange;", "change", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/button/ButtonChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<ButtonChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Button f100799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.button.a f100800m;

    /* compiled from: BeduinButtonComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ButtonChange.values().length];
            try {
                iArr[ButtonChange.f100769c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonChange.f100770d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonChange.f100771e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonChange.f100772f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Button button, com.avito.android.beduin.common.component.button.a aVar) {
        super(1);
        this.f100799l = button;
        this.f100800m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ButtonChange buttonChange) {
        int iOrdinal = buttonChange.ordinal();
        com.avito.android.beduin.common.component.button.a aVar = this.f100800m;
        Button button = this.f100799l;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Boolean boolIsEnabled = aVar.f100783f.isEnabled();
                button.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
            } else if (iOrdinal == 2) {
                Boolean boolIsLoading = aVar.f100783f.isLoading();
                boolean zBooleanValue = boolIsLoading != null ? boolIsLoading.booleanValue() : false;
                button.setLoading(zBooleanValue);
                button.setClickable(!zBooleanValue);
            } else if (iOrdinal == 3) {
                button.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(18, aVar, aVar.f100783f));
            }
        } else {
            String title = aVar.f100783f.getTitle();
            if (title == null) {
                title = "";
            }
            button.setText(title);
        }
        return G0.f406611a;
    }
}
