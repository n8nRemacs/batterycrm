package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class uh7 {
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final List p;
    public final boolean a;
    public final long b;
    public final pb3 c;
    public final String d;
    public final k18 e;
    public final k18 f;
    public final SharedPreferences g;
    public final LinkedHashMap h;
    public rh7 i;
    public Integer j;
    public cm6 k;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        l = timeUnit.toMillis(3L);
        m = timeUnit.toMillis(180L);
        n = timeUnit.toMillis(60L);
        o = timeUnit.toMillis(60L);
        p = ve3.j(100, Integer.valueOf(HttpStatus.SC_MULTIPLE_CHOICES), 150, 450);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uh7(boolean z, long j) {
        qh7 qh7Var = qh7.a;
        pb3 pb3Var = (pb3) qh7Var.getAccessor().c(46);
        Context context = (Context) qh7Var.getAccessor().c(12);
        bwf bwfVarD = qh7Var.getAccessor().d(88);
        bwf bwfVarD2 = qh7Var.getAccessor().d(151);
        this.a = z;
        this.b = j;
        this.c = pb3Var;
        this.d = uh7.class.getName();
        this.e = bwfVarD;
        this.f = bwfVarD2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("in_app_review_prefs", 0);
        this.g = sharedPreferences;
        this.h = new LinkedHashMap();
        rh7 rh7Var = null;
        String string = sharedPreferences.getString("pref_current_condition", null);
        if (string != null) {
            Iterator it = rh7.u0.iterator();
            while (true) {
                f2 f2Var = (f2) it;
                if (!f2Var.hasNext()) {
                    break;
                }
                Object next = f2Var.next();
                if (((rh7) next).a.equals(string)) {
                    rh7Var = next;
                    break;
                }
            }
            rh7Var = rh7Var;
        }
        this.i = rh7Var;
    }

    public final void a() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((sh7) it.next()).getClass();
        }
        this.g.edit().putString("pref_current_condition", null).apply();
        this.i = null;
    }

    public final void b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i == 4) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1L).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", jCurrentTimeMillis).apply();
            d(null);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", jCurrentTimeMillis).apply();
        }
        a();
    }

    public final void c(int i, Integer num) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i == 4) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", jCurrentTimeMillis).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", -1L).apply();
            d(num);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", jCurrentTimeMillis).apply();
        }
        a();
    }

    public final void d(Integer num) {
        rh7 rh7Var = this.i;
        if (rh7Var == null) {
            return;
        }
        Integer numD = rh7Var == rh7.s0 ? ((gda) this.f.getValue()).d() : this.j;
        if (numD != null) {
            nn8 nn8Var = new nn8();
            pb3 pb3Var = this.c;
            nn8Var.put("session_id", Long.valueOf(((pe8) pb3Var).K()));
            nn8Var.put("screen_from", numD);
            nn8Var.put("trigger", rh7Var.a);
            if (num != null) {
                nn8Var.put("mark", Integer.valueOf(num.intValue()));
            }
            nn8 nn8VarB = nn8Var.b();
            xp7 xp7Var = new xp7();
            xp7Var.c = "APP_REVIEW";
            xp7Var.d = "app_review";
            xp7Var.b = ((w4e) pb3Var).s();
            xp7Var.a = System.currentTimeMillis();
            xp7Var.c(nn8VarB);
            ((dd) this.e.getValue()).h(xp7Var.d());
        }
    }

    public final void e(Integer num) {
        if (this.i == null) {
            return;
        }
        if (num == null) {
            num = ((gda) this.f.getValue()).d();
        }
        if (ue3.A(p, num)) {
            this.j = num;
            if (this.a) {
                ai7.c.p0().b(":inAppReview/fake", null);
                return;
            }
            cm6 cm6Var = this.k;
            if (cm6Var != null) {
                cm6Var.invoke();
            }
        }
    }

    public final void f(Set set, f1e f1eVar) {
        rh7 rh7Var = this.i;
        String str = this.d;
        if (rh7Var != null) {
            wqi.c(str, "InAppReviewConditionManager triggerCondition() currentCondition != null (" + rh7Var + ")", new Object[0]);
            return;
        }
        pe8 pe8Var = (pe8) this.c;
        boolean zN = pe8Var.N();
        SharedPreferences sharedPreferences = this.g;
        if (zN) {
            ho7.q("InAppReviewConditionManager isTimeAllowsStartInAppReview() clientPrefs.isDisableInAppReviewTimeCondition:", str, pe8Var.N());
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - l < this.b) {
                wqi.c(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() hadCrashInPrevious3Days", new Object[0]);
                return;
            }
            long j = sharedPreferences.getLong("pref_last_fake_in_app_review_success_time", -1L);
            long j2 = sharedPreferences.getLong("pref_last_fake_in_app_review_fail_time", -1L);
            long j3 = sharedPreferences.getLong("pref_last_in_app_review_time", -1L);
            if ((j != -1 || j2 != -1 || j3 != -1) && ((j == -1 || jCurrentTimeMillis - j < m) && ((j2 == -1 || jCurrentTimeMillis - j2 < n) && (j3 == -1 || jCurrentTimeMillis - j3 < o)))) {
                StringBuilder sbL = az1.l(jCurrentTimeMillis, "InAppReviewConditionManager isTimeAllowsStartInAppReview() currentTime:", ", lastSuccessfulFakeReviewTime:");
                sbL.append(j);
                az1.r(j2, ", lastFailedFakeReviewTime:", ", lastReviewTime:", sbL);
                sbL.append(j3);
                wqi.c(str, sbL.toString(), new Object[0]);
                return;
            }
        }
        Iterator it = set.iterator();
        rh7 rh7Var2 = null;
        while (it.hasNext()) {
            th7 th7Var = (th7) it.next();
            rh7 rh7Var3 = th7Var.a;
            int i = th7Var.b;
            int iOrdinal = rh7Var3.ordinal();
            if (iOrdinal == 0) {
                int i2 = sharedPreferences.getInt("pref_sent_messages_count", 0) + i;
                if (i2 >= 5) {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", 0).apply();
                    rh7Var2 = th7Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", i2).apply();
                    wqi.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + th7Var + ", sentMessagesCount:" + i2, new Object[0]);
                }
            } else if (iOrdinal == 3) {
                int i3 = sharedPreferences.getInt("pref_reactions_count", 0) + i;
                if (i3 >= 2) {
                    sharedPreferences.edit().putInt("pref_reactions_count", 0).apply();
                    rh7Var2 = th7Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_reactions_count", i3).apply();
                    wqi.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + th7Var + ", addedReactionsCount:" + i3, new Object[0]);
                }
            } else if (iOrdinal == 4) {
                int i4 = sharedPreferences.getInt("pref_sent_stickers_count", 0) + i;
                if (i4 >= 3) {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", 0).apply();
                    rh7Var2 = th7Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", i4).apply();
                    wqi.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + th7Var + ", sentStickersCount:" + i4, new Object[0]);
                }
            } else if (iOrdinal != 5) {
                if (iOrdinal == 6) {
                    int i5 = sharedPreferences.getInt("pref_made_pin_count", 0) + i;
                    if (i5 >= 2) {
                        sharedPreferences.edit().putInt("pref_made_pin_count", 0).apply();
                    } else {
                        sharedPreferences.edit().putInt("pref_made_pin_count", i5).apply();
                        wqi.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + th7Var + ", madePinCount:" + i5, new Object[0]);
                    }
                }
                rh7Var2 = th7Var.a;
            } else {
                int i6 = sharedPreferences.getInt("pref_created_group_chats_count", 0) + i;
                if (i6 >= 2) {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", 0).apply();
                    rh7Var2 = th7Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", i6).apply();
                    wqi.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + th7Var + ", createdGroupChatsCount:" + i6, new Object[0]);
                }
            }
        }
        if (rh7Var2 == null || ((sh7) this.h.get(rh7Var2)) == null) {
            return;
        }
        this.i = rh7Var2;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        rh7 rh7Var4 = this.i;
        editorEdit.putString("pref_current_condition", rh7Var4 != null ? rh7Var4.a : null).apply();
        e(Integer.valueOf(f1eVar.a));
    }
}
