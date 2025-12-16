package com.avito.android.select.group_clearance_select;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.group_clearance_select.a;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.s0;

/* compiled from: GroupClearanceValuesMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/group_clearance_select/g;", "", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GroupClearanceParams f265498a;

    /* compiled from: GroupClearanceValuesMapper.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/group_clearance_select/g$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f265499a = new a();

        /* compiled from: GroupClearanceValuesMapper.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.select.group_clearance_select.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C7931a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f265500a;

            static {
                int[] iArr = new int[ClearanceTitle.values().length];
                try {
                    ClearanceTitle clearanceTitle = ClearanceTitle.f265409c;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ClearanceTitle clearanceTitle2 = ClearanceTitle.f265409c;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ClearanceTitle clearanceTitle3 = ClearanceTitle.f265409c;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    ClearanceTitle clearanceTitle4 = ClearanceTitle.f265409c;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    ClearanceTitle clearanceTitle5 = ClearanceTitle.f265409c;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f265500a = iArr;
            }
        }

        @Y61.l
        public static com.avito.android.select.group_clearance_select.a a(@Y61.l ClearanceTitle clearanceTitle, int i12, int i13, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            int i14 = clearanceTitle == null ? -1 : C7931a.f265500a[clearanceTitle.ordinal()];
            if (i14 == -1) {
                return null;
            }
            if (i14 == 1) {
                return new a.e(i12, i13, str, str2, str3, null, false, 96, null);
            }
            if (i14 == 2) {
                return new a.b(i12, i13, str, str2, str3, null, false, 96, null);
            }
            if (i14 == 3) {
                return new a.c(i12, i13, str, str2, str3, null, false, 96, null);
            }
            if (i14 == 4) {
                return new a.C7927a(i12, i13, str, str2, str3, null, false, 96, null);
            }
            if (i14 == 5) {
                return new a.d(i12, i13, str, str2, str3, null, false, 96, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public g(@Y61.k GroupClearanceParams groupClearanceParams) {
        this.f265498a = groupClearanceParams;
    }

    public static ClearanceTitle a(String str) {
        Object next;
        Iterator it = ((AbstractC42738c) ClearanceTitle.f265415i).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ClearanceTitle) next).f265416b.equals(str)) {
                break;
            }
        }
        return (ClearanceTitle) next;
    }
}
