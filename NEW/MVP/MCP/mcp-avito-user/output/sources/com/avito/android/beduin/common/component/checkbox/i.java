package com.avito.android.beduin.common.component.checkbox;

import Y61.k;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Checkboxes.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    /* compiled from: Checkboxes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100943a;

        static {
            int[] iArr = new int[CheckboxState.values().length];
            try {
                iArr[CheckboxState.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckboxState.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckboxState.INDETERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100943a = iArr;
        }
    }

    public static final void a(@k Checkbox checkbox, @k CheckboxState checkboxState) {
        State state;
        int i12 = a.f100943a[checkboxState.ordinal()];
        if (i12 == 1) {
            state = State.f181147b;
        } else if (i12 == 2) {
            state = State.f181148c;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            state = State.f181149d;
        }
        JV.a.a(checkbox, state);
    }
}
