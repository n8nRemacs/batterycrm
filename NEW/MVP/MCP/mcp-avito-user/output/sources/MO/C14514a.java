package Mo;

import Y61.l;
import com.avito.android.code_check.phone_list.adapter.LeftIconType;
import com.avito.android.code_check_public.screen.PhoneList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhoneListItemView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-check_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14514a {

    /* compiled from: PhoneListItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mo.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0701a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11017a;

        static {
            int[] iArr = new int[PhoneList.ItemIcon.values().length];
            try {
                PhoneList.ItemIcon itemIcon = PhoneList.ItemIcon.f119308b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhoneList.ItemIcon itemIcon2 = PhoneList.ItemIcon.f119308b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11017a = iArr;
        }
    }

    @l
    public static final LeftIconType a(@l PhoneList.ItemIcon itemIcon) {
        int i12 = itemIcon == null ? -1 : C0701a.f11017a[itemIcon.ordinal()];
        if (i12 == -1) {
            return null;
        }
        if (i12 == 1) {
            return LeftIconType.f118919b;
        }
        if (i12 == 2) {
            return LeftIconType.f118920c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
