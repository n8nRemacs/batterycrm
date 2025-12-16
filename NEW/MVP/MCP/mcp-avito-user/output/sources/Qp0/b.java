package qp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipPrivateForecastData.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lqp0/b;", "", "", "itemId", "checkoutContext", "", "selected", "duration", "", "customDay", "", "Lqp0/b$a;", "budgets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V", "Ljava/lang/String;", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getCheckoutContext", "setCheckoutContext", "Ljava/lang/Integer;", "getSelected", "()Ljava/lang/Integer;", "setSelected", "(Ljava/lang/Integer;)V", "a", "setDuration", "Z", "getCustomDay", "()Z", "setCustomDay", "(Z)V", "Ljava/util/List;", "getBudgets", "()Ljava/util/List;", "setBudgets", "(Ljava/util/List;)V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    @com.google.gson.annotations.c("budgets")
    @l
    private List<a> budgets;

    @com.google.gson.annotations.c("checkoutContext")
    @l
    private String checkoutContext;

    @com.google.gson.annotations.c("customDay")
    private boolean customDay;

    @com.google.gson.annotations.c("duration")
    @l
    private Integer duration;

    @com.google.gson.annotations.c("itemId")
    @k
    private String itemId;

    @com.google.gson.annotations.c("selected")
    @l
    private Integer selected;

    /* compiled from: BbipPrivateForecastData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqp0/b$a;", "", "", "id", "", "dailyBudget", "<init>", "(ILjava/lang/Long;)V", "I", "getId", "()I", "setId", "(I)V", "Ljava/lang/Long;", "getDailyBudget", "()Ljava/lang/Long;", "setDailyBudget", "(Ljava/lang/Long;)V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("dailyBudget")
        @l
        private Long dailyBudget;

        @com.google.gson.annotations.c("id")
        private int id;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public a(int i12, @l Long l12) {
            this.id = i12;
            this.dailyBudget = l12;
        }

        public /* synthetic */ a(int i12, Long l12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? null : l12);
        }
    }

    public b(@k String str, @l String str2, @l Integer num, @l Integer num2, boolean z12, @l List<a> list) {
        this.itemId = str;
        this.checkoutContext = str2;
        this.selected = num;
        this.duration = num2;
        this.customDay = z12;
        this.budgets = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    public /* synthetic */ b(String str, String str2, Integer num, Integer num2, boolean z12, List list, int i12, C42822w c42822w) {
        this(str, str2, num, num2, z12, (i12 & 32) != 0 ? null : list);
    }
}
