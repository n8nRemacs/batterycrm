package defpackage;

import tech.kwik.agent15.alert.UnexpectedMessageAlert;

/* loaded from: classes.dex */
public interface nb3 extends pl9 {
    @Override // defpackage.pl9
    default void a() throws UnexpectedMessageAlert {
        throw new UnexpectedMessageAlert("no client hello expected");
    }
}
