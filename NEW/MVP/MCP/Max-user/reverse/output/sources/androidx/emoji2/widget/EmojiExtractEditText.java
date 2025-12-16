package androidx.emoji2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.widget.a;
import defpackage.ab5;
import defpackage.k6d;
import defpackage.kc5;
import defpackage.mb5;

/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    public ab5 a;
    public final boolean b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.b) {
            return;
        }
        this.b = true;
        int i = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k6d.EmojiEditText, R.attr.editTextStyle, 0);
            int integer = typedArrayObtainStyledAttributes.getInteger(k6d.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
            typedArrayObtainStyledAttributes.recycle();
            i = integer;
        }
        setMaxEmojiCount(i);
        setKeyListener(super.getKeyListener());
    }

    private ab5 getEmojiEditTextHelper() {
        if (this.a == null) {
            this.a = new ab5(this, true);
        }
        return this.a;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().b;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.f(callback, this));
    }

    public void setEmojiReplaceStrategy(int i) {
        ab5 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.c = i;
        ((kc5) emojiEditTextHelper.a.c).o = i;
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper().a.getClass();
            if (!(keyListener instanceof mb5) && !(keyListener instanceof NumberKeyListener)) {
                keyListener = new mb5(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        ab5 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.getClass();
        if (i < 0) {
            throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
        }
        emojiEditTextHelper.b = i;
        ((kc5) emojiEditTextHelper.a.c).d = i;
    }
}
