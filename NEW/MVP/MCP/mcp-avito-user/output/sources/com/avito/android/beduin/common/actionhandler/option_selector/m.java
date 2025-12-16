package com.avito.android.beduin.common.actionhandler.option_selector;

import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorResolver.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/m;", "", "<init>", "()V", "Lcom/avito/android/beduin/common/actionhandler/option_selector/d;", "bottomSheetSelector", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {

    /* compiled from: SelectorResolver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100337a;

        static {
            int[] iArr = new int[OpenOptionSelectorAction.ScreenSettings.SelectorStyle.values().length];
            try {
                iArr[OpenOptionSelectorAction.ScreenSettings.SelectorStyle.LARGE_TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenOptionSelectorAction.ScreenSettings.SelectorStyle.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100337a = iArr;
        }
    }

    @Inject
    public m() {
    }
}
