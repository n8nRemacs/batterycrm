package ru.cyberity.input.signalproviders;

import Y61.k;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StabilityLevel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/cyberity/fingerprint/signalproviders/StabilityLevel;", "", "(Ljava/lang/String;I)V", "atLeastAsStableAs", "", PluralsKeys.OTHER, "atLeastAsStableAs$cyberity_mobile_sdk_internal_core_release", "STABLE", "OPTIMAL", "UNIQUE", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public enum StabilityLevel {
    STABLE,
    OPTIMAL,
    UNIQUE;

    /* compiled from: StabilityLevel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f436052a;

        static {
            int[] iArr = new int[StabilityLevel.values().length];
            iArr[StabilityLevel.STABLE.ordinal()] = 1;
            iArr[StabilityLevel.OPTIMAL.ordinal()] = 2;
            iArr[StabilityLevel.UNIQUE.ordinal()] = 3;
            f436052a = iArr;
        }
    }

    public final boolean atLeastAsStableAs$cyberity_mobile_sdk_internal_core_release(@k StabilityLevel other) {
        int[] iArr = a.f436052a;
        int i12 = iArr[ordinal()];
        if (i12 == 1) {
            return true;
        }
        if (i12 == 2) {
            int i13 = iArr[other.ordinal()];
            if (i13 != 1) {
                if (i13 == 2 || i13 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i14 = iArr[other.ordinal()];
            if (i14 != 1 && i14 != 2) {
                if (i14 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
