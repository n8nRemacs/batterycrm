package com.yandex.div2;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPatch;
import com.yandex.div2.S3;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class R3 implements com.yandex.div.internal.parser.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f373476b;

    public /* synthetic */ R3(int i12) {
        this.f373476b = i12;
    }

    @Override // com.yandex.div.internal.parser.x
    public final boolean isValid(List list) {
        switch (this.f373476b) {
            case 0:
                S3.b bVar = S3.f373502c;
                if (list.size() >= 2) {
                    break;
                }
                break;
            case 1:
                com.yandex.div.json.expressions.b<Long> bVar2 = T3.f373553c;
                if (list.size() >= 2) {
                    break;
                }
                break;
            case 2:
                com.yandex.div.json.expressions.b<Long> bVar3 = T3.f373553c;
                if (list.size() >= 2) {
                    break;
                }
                break;
            case 3:
                DivPager.f fVar = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 4:
                DivPager.f fVar2 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 5:
                DivPager.f fVar3 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 6:
                DivPager.f fVar4 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 7:
                DivPager.f fVar5 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 8:
                DivPager.f fVar6 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 9:
                DivPager.f fVar7 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 10:
                DivPager.f fVar8 = DivPager.f371768G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 11:
                DivAccessibility divAccessibility = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 12:
                DivAccessibility divAccessibility2 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 13:
                DivAccessibility divAccessibility3 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 14:
                DivAccessibility divAccessibility4 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 15:
                DivAccessibility divAccessibility5 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 16:
                DivAccessibility divAccessibility6 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 17:
                DivAccessibility divAccessibility7 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 18:
                DivAccessibility divAccessibility8 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 19:
                DivAccessibility divAccessibility9 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 20:
                DivAccessibility divAccessibility10 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 21:
                DivAccessibility divAccessibility11 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 22:
                DivAccessibility divAccessibility12 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 23:
                DivAccessibility divAccessibility13 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                DivAccessibility divAccessibility14 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                DivAccessibility divAccessibility15 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                DivAccessibility divAccessibility16 = C38389j4.f375424G;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                DivPatch.d dVar = DivPatch.f371843b;
                if (list.size() >= 1) {
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                DivPatch.a.b bVar4 = DivPatch.a.f371855b;
                if (list.size() >= 1) {
                    break;
                }
                break;
            default:
                com.yandex.div.json.expressions.b<DivPatch.Mode> bVar5 = C38513r4.f376230c;
                if (list.size() >= 1) {
                    break;
                }
                break;
        }
        return true;
    }
}
