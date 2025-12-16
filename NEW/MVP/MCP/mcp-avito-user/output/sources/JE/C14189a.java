package Je;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_loans_cabinet.generated.api.autoloan_user_blanks.UserBlanksActiveData;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AutoloanUserBlanksResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJe/a;", "", "Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData;", "activeBlank", "", "LJe/b;", "finishedBlanks", "<init>", "(Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData;Ljava/util/List;)V", "Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData;", "a", "()Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Je.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14189a {

    @c("activeBlank")
    @l
    private final UserBlanksActiveData activeBlank;

    @c("finishedBlanks")
    @k
    private final List<b> finishedBlanks;

    public C14189a(@l UserBlanksActiveData userBlanksActiveData, @k List<b> list) {
        this.activeBlank = userBlanksActiveData;
        this.finishedBlanks = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final UserBlanksActiveData getActiveBlank() {
        return this.activeBlank;
    }

    @k
    public final List<b> b() {
        return this.finishedBlanks;
    }
}
