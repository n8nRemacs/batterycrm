package com.avito.android.messenger;

import com.avito.android.C30277e1;
import com.avito.android.persistence.messenger.UserHashRotationGroup;
import com.avito.android.persistence.messenger.X0;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: DbPurgeInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/persistence/messenger/X0;", "lastKnownUsers", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32369d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.avito.messenger.p0 f195280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31691c f195281c;

    public C32369d(ru.avito.messenger.p0 p0Var, C31691c c31691c) {
        this.f195280b = p0Var;
        this.f195281c = c31691c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ru.avito.messenger.p0 p0Var;
        C31691c c31691c;
        T next;
        UserHashRotationGroup userHashRotationGroup;
        UserHashRotationGroup userHashRotationGroup2;
        UserHashRotationGroup userHashRotationGroup3;
        Iterator<T> it = ((List) obj).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            p0Var = this.f195280b;
            c31691c = this.f195281c;
            if (!zHasNext) {
                next = (T) null;
                break;
            }
            next = it.next();
            X0 x02 = (X0) next;
            if (kotlin.jvm.internal.L.f(x02.f215344a, p0Var.f431828b)) {
                MessengerUserType messengerUserType = p0Var.f431829c.f430681c;
                c31691c.getClass();
                if (messengerUserType instanceof MessengerUserType.Default ? true : messengerUserType instanceof MessengerUserType.Employee.Personal) {
                    userHashRotationGroup3 = UserHashRotationGroup.f215322c;
                } else {
                    if (!(messengerUserType instanceof MessengerUserType.Employee.Company)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userHashRotationGroup3 = UserHashRotationGroup.f215323d;
                }
                if (x02.f215346c == userHashRotationGroup3) {
                    break;
                }
            }
        }
        X0 x03 = next;
        if (x03 != null) {
            String str = p0Var.f431829c.f430682d;
            String str2 = x03.f215345b;
            if (!kotlin.jvm.internal.L.f(str2, str)) {
                C30277e1 c30277e1 = c31691c.f186703e;
                c30277e1.getClass();
                kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[34];
                boolean zBooleanValue = ((Boolean) c30277e1.f144961H.a().invoke()).booleanValue();
                InterfaceC32522f interfaceC32522f = c31691c.f186702d;
                C41826q c41826qE = zBooleanValue ? interfaceC32522f.e(str2) : interfaceC32522f.c();
                String str3 = p0Var.f431828b;
                MessengerUserHashInfo messengerUserHashInfo = p0Var.f431829c;
                String str4 = messengerUserHashInfo.f430682d;
                MessengerUserType messengerUserType2 = messengerUserHashInfo.f430681c;
                if (messengerUserType2 instanceof MessengerUserType.Default ? true : messengerUserType2 instanceof MessengerUserType.Employee.Personal) {
                    userHashRotationGroup2 = UserHashRotationGroup.f215322c;
                } else {
                    if (!(messengerUserType2 instanceof MessengerUserType.Employee.Company)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userHashRotationGroup2 = UserHashRotationGroup.f215323d;
                }
                return c41826qE.g(c31691c.f186701c.b(new X0(str3, str4, userHashRotationGroup2)));
            }
        }
        if (x03 != null) {
            return C41823n.f402260b;
        }
        c31691c.getClass();
        String str5 = p0Var.f431828b;
        MessengerUserHashInfo messengerUserHashInfo2 = p0Var.f431829c;
        String str6 = messengerUserHashInfo2.f430682d;
        MessengerUserType messengerUserType3 = messengerUserHashInfo2.f430681c;
        if (messengerUserType3 instanceof MessengerUserType.Default ? true : messengerUserType3 instanceof MessengerUserType.Employee.Personal) {
            userHashRotationGroup = UserHashRotationGroup.f215322c;
        } else {
            if (!(messengerUserType3 instanceof MessengerUserType.Employee.Company)) {
                throw new NoWhenBranchMatchedException();
            }
            userHashRotationGroup = UserHashRotationGroup.f215323d;
        }
        return c31691c.f186701c.b(new X0(str5, str6, userHashRotationGroup));
    }
}
