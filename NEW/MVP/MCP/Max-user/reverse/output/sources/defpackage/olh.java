package defpackage;

import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class olh extends j3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ olh(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM webapp_biometry";
            case 1:
                return "DELETE FROM webapp_biometry WHERE user_id = ? AND bot_id = ?";
            case 2:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 3:
                return "DELETE FROM WorkProgress";
            case 4:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 5:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 6:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 7:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 8:
                return "DELETE FROM workspec WHERE id=?";
            case 9:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 10:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 11:
                return "UPDATE workspec SET output=? WHERE id=?";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 13:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }
}
